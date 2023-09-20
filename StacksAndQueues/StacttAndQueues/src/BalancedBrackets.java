import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String exp = "[(a + b) + {(c + d) * (e / f)}]";

        int i = 0;
        Stack<Character> opt = new Stack<>();
        Stack<Character> clt = new Stack<>();
        Stack<Character> st = new Stack<>();

        boolean isBalance = true;
        while(i < exp.length()){
            char c = exp.charAt(i);


            if(c == '[' || c == '(' || c == '{' ){
                opt.push(c);
                st.push(c);

                if(c == '['){
                    clt.push(']');
                }
                else if(c == '('){
                    clt.push(')');
                }
                else if(c == '{'){
                    clt.push('}');
                }


            } else if (c == ']' || c == ')' || c == '}'  ) {
                if(clt.peek() != c){
                    isBalance = false;
                    break;
                }
                else {
                    while(st.peek() != opt.peek()){
                        st.pop();
                    }
                    st.pop();
                    opt.pop();
                    clt.pop();
                }
            }
            else{
                st.push(c);
            }
            i++;
        }
        if(isBalance && opt.size() == 0)
        System.out.println(true);
        else
            System.out.println(false);
    }
}
