import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixEvaluationSumeetSir  {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Integer> oprand = new Stack<>();
        Stack<Character> oprator = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == '('){
                oprator.push(ch);
            }
            else if(ch == ')'){
                while(oprator.peek() != '('){
                    int v2 = oprand.pop();
                    int v1 = oprand.pop();
                    char oprat = oprator.pop();

                    int result = calculation(v1,v2,oprat);
                    oprand.push(result);
                }
                oprator.pop();
            } else if (Character.isDigit(ch)) {
                oprand.push(ch - '0');

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while(oprator.size() > 0 && oprator.peek() != '(' && precedence(ch) <= precedence(oprator.peek())){
                    int v2 = oprand.pop();
                    int v1 = oprand.pop();
                    char oprat = oprator.pop();

                    int result = calculation(v1,v2,oprat);
                    oprand.push(result);
                }
                oprator.push(ch);
            }
        }
        while(oprator.size() > 0){
            int v2 = oprand.pop();
            int v1 = oprand.pop();
            char oprat = oprator.pop();

            int result = calculation(v1,v2,oprat);
            oprand.push(result);
        }
        System.out.println(oprand.peek());
    }

    public static int precedence(char oprator){
        if(oprator == '+' || oprator == '-'){
            return 1;
        } else if (oprator == '*' || oprator == '/') {
            return 2;
        }
        return 0;
    }

    public static int calculation(int v1, int v2, char oprator){
        int val = 0;
        if(oprator == '+'){
            val = v1 + v2;
        }
        else if(oprator == '-'){
            val = v1 - v2;
        }
        else if(oprator == '*'){
            val = v1 * v2;
        }
        else if(oprator == '/'){
            val = v1 / v2;
        }
        return val;
    }
}
