import java.util.Scanner;

public class gcdAndLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

//        GCD
        int sm = 0;
        if(num1 < num2){
            sm = num1;
        }else
            sm = num2;

        int gcd = 0;
        for (int i = 1; i < sm; i++) {
            if(num1%i == 0 && num2%i == 0){
                gcd = i;
            }
        }

        int div = 2;
        int lcm = 1;
        while(num2 > 1 || num1 > 1 ){
            if(num1 % div ==0 && num2%div == 0){
                num2/=div;
                num1/=div;
                lcm = lcm * div;
            }
            else if(num1 % div ==0){
                num1/=div;
                lcm = lcm * div;
            }
            else if(num2 % div ==0){
                num2/=div;
                lcm = lcm * div;
            }
            else
                div++;
        }

        System.out.println(gcd + " lcm :" + lcm);
    }
}
