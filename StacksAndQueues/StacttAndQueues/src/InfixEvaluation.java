import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> oprand = new Stack<>();
        Stack<Character> oprator = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(oprator.size() > 0 && oprator.peek() != '(' && precedence(ch) <= precedence(oprator.peek())){
                    cal(oprand, oprator);
                }
                oprator.push(ch);
            } else if ( ch == '(') {
                oprator.push('(');
            } else if ( ch == ')') {
                while(oprator.peek() != '('){
                    cal(oprand,oprator);
                }
                oprator.pop();
            }
            else if(Character.isDigit(ch)){
                oprand.push(ch - '0');
            }
        }

        while(oprator.size() != 0){
            cal(oprand,oprator);
        }
        System.out.println(oprand.peek());
    }
    public static int precedence(int oprator){
        if(oprator == '+' || oprator == '-'){
            return 1;
        }
        else if(oprator == '/' || oprator == '*'){
            return 2;
        }

        return 0;
    }
    public static void cal(Stack<Integer> oprand,Stack<Character> oprator){
        int a = oprand.peek();
        oprand.pop();
        int b = oprand.peek();
        oprand.pop();
        char op = oprator.peek();
        oprator.pop();
        if(op == '+'){
            oprand.push( (a+b));
        }
        else if(op == '-'){
            oprand.push( (b-a));
        }
        else if(op == '*'){
            oprand.push( (b*a));
        }
        else if(op == '/'){
            oprand.push( (b/a));
        }
    }
}
//2 + (5-3*6/2)