import java.util.Scanner;

public class printKpc {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String str = in.next();
        printKPC(str, " ");
    }

    static String[] keys = {",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        char ch = str.charAt(0);
        int num = ch - '0';

        for (int i = 0; i < keys[num].length(); i++) {
            printKPC(str.substring(1), asf + keys[num].charAt(i));
        }
    }
}
