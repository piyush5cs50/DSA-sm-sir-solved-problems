import java.util.Scanner;

public class PrintSubSequence {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String str = in.next();
        printSS(str, "");
    }

    public static void printSS(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        printSS(str.substring(1),str.charAt(0) + ans);
        printSS(str.substring(1),ans);
    }
}
