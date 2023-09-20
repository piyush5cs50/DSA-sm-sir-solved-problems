import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class PostfixEvaluationAndConversions {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> value = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> preFix = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch >= '0' && ch <= '9'){
                value.push(ch - '0');
                infix.push(ch+"");
                preFix.push(ch+"");
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = value.pop();
                int v1 = value.pop();
                value.push(oprate(v1,v2,ch));

                String infixV2 = infix.pop();
                String infixV1 = infix.pop();
                infix.push("(" + infixV1 + ch + infixV2 + ")");

                String prefixV2 = preFix.pop();
                String prefixV1 = preFix.pop();
                preFix.push( ch + prefixV1 + prefixV2);
            }
        }
        System.out.println(value.peek());
        System.out.println(infix.peek());
        System.out.println(preFix.peek());
    }
    public static int oprate(int v1,int v2,char oprator){
        if(oprator == '+'){
            return v1 + v2;
        }
        else if(oprator == '-'){
            return v1 - v2;
        }
        else if(oprator == '*'){
            return v1 * v2;
        }
        else {
            return v1 / v2;
        }
    }
}


//answers
//2
//((2+((6*4)/8))-3)
//-+2/*6483