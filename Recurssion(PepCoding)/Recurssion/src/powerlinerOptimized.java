import java.util.Scanner;

public class powerlinerOptimized {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.println(power(x, n));
    }
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        int pow = power(x, n/2);
        int multi = pow * pow;

        if(n % 2 == 1){
            multi = multi * x;
        }

        return multi;
    }
}
