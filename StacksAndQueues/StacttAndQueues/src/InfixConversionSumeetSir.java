import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixConversionSumeetSir {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == '('){
                ops.push(ch);
            }else if(ch == ')'){
                while(ops.peek() != '('){
                    process(ops, pre,post);
                }
                ops.pop();
            }
            else if((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                pre.push(ch + "");
                post.push(ch + "");
            }
            else if(ch == '+' || ch == '-'  || ch == '*' || ch == '/'){
             while(ops.size() > 0 && ops.peek() != '(' && precedence(ch) <= precedence(ops.peek())){
                 process(ops,pre,post);
             }
             ops.push(ch);
            }
        }
        while(ops.size() > 0){
            process(ops,pre,post);
        }
        System.out.println(post.pop());
        System.out.println(pre.pop());

    }
    public static void process(Stack<Character> ops, Stack<String> pre, Stack<String> post){
        char op = ops.pop();

        String prev2 = pre.pop();
        String prev1 = pre.pop();
        String preRes = op + prev1 + prev2;
        pre.push(preRes);

        String postv2 = post.pop();
        String postv1 = post.pop();
        String postRes =  postv1 + postv2 + op;
        post.push(postRes);
    }
    public static int precedence(char oprator){
        if(oprator == '+' ||oprator == '-'){
            return 1;
        }
        else if(oprator == '*' ||oprator == '/'){
            return 2;
        }
        else {
            return 0;
        }
    }
}


//abc-d+*e/
///*a+-bcde