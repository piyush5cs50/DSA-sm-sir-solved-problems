import java.util.Scanner;

public class FibonacciNumbersTillN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 0; i < n; i++){
            System.out.println(a);
            c = a+b;
            a= b;
            b= c;

        }
    }
}
