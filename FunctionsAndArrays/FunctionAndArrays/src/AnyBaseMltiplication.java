import java.util.Scanner;

public class AnyBaseMltiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){

        int result1 = 0;
        int result2 = 0;
        int result = 1;
        while(n2 > 0){
            int rem2 = n2%10;
            int carry = 0;

            int r = 0;
            int pow = 1;
            int num = n1;
            while (num > 0){
                int rem1 = num%10;
                num/=10;
                int pro = rem1 * rem2 + carry;
                carry = pro/b;
                int rem = pro%b;
                r = r + rem * pow;
                pow *= 10;
            }
            if (result == 2)
            result2 = r * (int)Math.pow(10,1);
            else
                result1 = r * (int)Math.pow(10,0);

            result++;

            n2 /= 10;
        }

        result = getAddition(b,result1,result2);

        return result;
    }

    public static int getAddition(int b, int n1, int n2){
        int result = 0;
        int c = 0;
        int p = 1;
        while(n1 > 0 || n2 > 0 || c > 0){
            int rem1 = n1%10;
            int rem2 = n2%10;
            n1/=10;
            n2/=10;

            int d = rem1 + rem2 + c;
            c = d/8;
            d = d%b;

            result = result + d*p;
            p = p * 10;
        }
        return result;
    }
}
