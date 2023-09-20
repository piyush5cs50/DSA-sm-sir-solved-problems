import java.util.Scanner;

public class powerliner {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the base number");
        int x = in.nextInt();
        System.out.println("enter the power");
        int n = in.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }


        int pow = power(x, n-1);
        int mul = pow * x;
        return mul;
    }
}
