import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(printIncreasing(n));
    }

    static int printIncreasing(int n){
        if(n == 1)
            return 1;
        int fn1 = printIncreasing(n-1);
        int fn = n * fn1;
        return fn;
    }
}