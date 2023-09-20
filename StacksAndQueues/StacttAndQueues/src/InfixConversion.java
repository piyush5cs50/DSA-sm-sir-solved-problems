import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixConversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> oprator = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == '('){
                oprator.push(ch);
            } else if (ch == ')') {
                while(oprator.peek() != '('){
                    boolean isPre = true;
                    String v2 = String.valueOf(pre.pop());
                    String v1 = String.valueOf(pre.pop());
                    char oprat = oprator.peek();
                    String res = preOprate(v1,v2,oprat,isPre);
                    pre.push(res);

                    isPre = false;
                    String v22 = String.valueOf(post.pop());
                    String v21 = String.valueOf(post.pop());
                    char oprat2 = oprator.pop();
                    String res2 = preOprate(v21,v22,oprat,isPre);
                    post.push(res2);
                }
                oprator.pop();
            } else if (Character.isLetterOrDigit(ch)) {
                post.push(String.valueOf(ch));
                pre.push(String.valueOf(ch));
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while (oprator.size() > 0 && oprator.peek() != '(' && precedence(ch) <= precedence(oprator.peek())){
                    boolean isPre = true;
                    String v2 = String.valueOf(pre.pop());
                    String v1 = String.valueOf(pre.pop());
                    char oprat = oprator.peek();
                    String res = preOprate(v1,v2,oprat,isPre);
                    pre.push(res);

                    isPre = false;
                    String v22 = String.valueOf(post.pop());
                    String v21 = String.valueOf(post.pop());
                    char oprat2 = oprator.pop();
                    String res2 = preOprate(v21,v22,oprat,isPre);
                    post.push(res2);
                }
                oprator.push(ch);
            }
        }
        while(oprator.size() > 0){
            boolean isPre = true;
            String v2 = String.valueOf(pre.pop());
            String v1 = String.valueOf(pre.pop());
            char oprat = oprator.peek();
            String res = preOprate(v1,v2,oprat,isPre);
            pre.push(res);

            isPre = false;
            String v22 = String.valueOf(post.pop());
            String v21 = String.valueOf(post.pop());
            char oprat2 = oprator.pop();
            String res2 = preOprate(v21,v22,oprat,isPre);
            post.push(res2);
        }
        System.out.println(post.peek());
        System.out.println(pre.peek());
    }
    public static String preOprate(String v1, String v2, char oprator, boolean isPre){
        String exp = "";
        if(oprator == '+'){
            if(isPre){
                exp = "+" + v1 + v2;
            }
            else
                exp = v1 + v2 + "+";
        }
        else if(oprator == '-'){
            if(isPre){
                exp = "-" + v1 + v2;
            }
            else
                exp = v1 + v2 + "-";

        }
        else if(oprator == '*'){
            if(isPre){
                exp = "*" + v1 + v2;
            }
            else
                exp = v1 + v2 + "*";
        }
        else if(oprator == '/'){
            if(isPre){
                exp = "/" + v1 + v2;
            }
            else
                exp = v1 + v2 + "/";
        }
        return exp;
    }
    public static int precedence(char oprator){
        if(oprator == '+' || oprator == '-'){
            return 1;
        }
        else if(oprator == '*' || oprator == '/'){
            return 2;
        }
        return 0;
    }


//    abc-d+*e/
///*a+-bcde
}
