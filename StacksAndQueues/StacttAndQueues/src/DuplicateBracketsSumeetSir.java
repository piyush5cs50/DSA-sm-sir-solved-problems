import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracketsSumeetSir {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        String st = "((a + b) + ((c + d)))";
        Stack<Character> stc = new Stack<>();

        int i = 0;
        boolean isDuplicate = false;
        while(i < st.length()){
            char ch = st.charAt(i);

            if(ch == ')'){
                if(stc.peek() == '('){
                    isDuplicate = true;
                    break;
                }
                else {
                    while (stc.peek() != '('){
                        stc.pop();
                    }
                    stc.pop();
                }
            }
            else {
                stc.push(ch);
            }
            i++;
        }
        System.out.println(isDuplicate);
    }
}
