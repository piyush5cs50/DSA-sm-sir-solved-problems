import java.util.Scanner;
import java.util.Stack;

public class BalancedBracketsSumeetSir {
    public static void main(String[] args) {
        String exp = "[(a + b) + {(c + d) * (e / f)}]";

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if((c == '[' || c == '(' || c == '{' )){
                st.push(c);
            }else if(c == ']'){
                boolean isExp = isExp(st,'[');
                if(!isExp){
                    System.out.println(false);
                    return;
                }

            } else if (c == ')') {
                boolean isExp = isExp(st,'(');
                if(!isExp){
                    System.out.println(false);
                    return;
                }
            } else if (c == '}') {
                boolean isExp = isExp(st,'{');
                if(!isExp){
                    System.out.println(false);
                    return;
                }
            }

        }
        if(st.size() ==0){
            System.out.println(true);
        }else
            System.out.println(false);

    }
    public static boolean isExp(Stack<Character> st, char cl){
        if(st.size() == 0){
            return false;
        }
        else if(st.peek() != cl){
            return false;
        }
        else
            st.pop();
        return true;
    }
}
