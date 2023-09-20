import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> value = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> postfix = new Stack<>();


        for (int i = exp.length() - 1 ;i >= 0; i--) {
            char ch = exp.charAt(i);


            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
                char oprator = ch;
                int v1 = value.pop();
                int v2 = value.pop();
                value.push(oprate(v1,v2,oprator));

                String iv1 = infix.pop();
                String iv2 = infix.pop();
                infix.push("(" + iv1 + ch + iv2 + ")");

                String pfv1 = postfix.pop();
                String pfv2 = postfix.pop();
                postfix.push(pfv1 + pfv2 + ch);
            }
            else {
                value.push(ch - '0');
                infix.push(ch + "");
                postfix.push(ch + "");
            }
        }


        System.out.println(value.peek());
        System.out.println(infix.peek());
        System.out.println(postfix.peek());
    }
    public static int oprate(int v1, int v2, char oprator){
        if(oprator == '+'){
            return v1 + v2;
        }
        else if(oprator == '-'){
            return v1 - v2;
        }
        else if(oprator == '*'){
            return v1 * v2;
        }
        else{
            return v1 / v2;
        }
    }
}
//2
//((2+((6*4)/8))-3)
//264*8/+3-