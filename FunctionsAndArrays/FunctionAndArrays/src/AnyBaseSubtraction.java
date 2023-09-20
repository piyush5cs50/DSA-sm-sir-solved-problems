import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){


        int pow = 1;
        int res = 0;
        int carry = 0;
        while (n1 > 0 || n2 > 0 || carry < 0){
            int rem1 = n1%10;
            int rem2 = n2%10;
            System.out.println(rem1 );
            n1/=10;
            n2/=10;
            while (carry < 0){
                   rem1--;
                   carry++;
            }

            while(rem1 < rem2){
                carry--;
                rem1+=8;
            }

            int sum = rem1 - rem2;
            res = res + sum * pow;
            pow*=10;
        }
        return res;
    }
}
