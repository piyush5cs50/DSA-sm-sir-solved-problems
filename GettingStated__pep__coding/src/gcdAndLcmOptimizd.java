import java.util.Scanner;

public class gcdAndLcmOptimizd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int on1 = num1;
        int on2 = num2;

        while(on1 % on2 != 0){
            int rem = on1%on2;
            on1 = on2;
            on2 = rem;
        }

        int gcd = on2;

        int lcm = (num1 * num2) / gcd;

        System.out.println(gcd + " " + lcm);
    }
}
