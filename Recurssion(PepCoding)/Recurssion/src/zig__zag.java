import javax.swing.*;
import java.util.Scanner;

public class zig__zag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        zigZag(n);
    }
    public static void zigZag(int n){
        if(n == 0){
            return;
        }

        System.out.println("pre" + n);
        zigZag(n-1);
        System.out.println("in" + n);
        zigZag(n-1);
        System.out.println("post" + n);
    }
}
