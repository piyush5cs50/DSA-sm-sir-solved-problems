import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String exp = "((a + b) + ((c + d)))";

        Stack<Character> ch = new Stack<>();

        int i = 0;
        boolean isDuplicate = false;
        while(i < exp.length()){
            char c = exp.charAt(i);
            int pop = 0;

            if(c != ')'){
                ch.push(c);
            } else {
                if(ch.peek() == '('){
                    isDuplicate = true;
                    break;
                }
                else {
                    while (ch.peek() != '('){
                        ch.pop();
                    }
                    ch.pop();
                }
            }
            i++;
        }
        System.out.println(isDuplicate);
    }
}
