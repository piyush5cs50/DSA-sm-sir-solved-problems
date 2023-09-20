import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2){
        int carry = 0;
        int sum = 0;
        int pow = 0;
        while (n1 != 0 || n2 != 0){
            int rem1 = n1%10;
            int rem2 = n2%10;
            int add = rem1 + rem2 + carry;

            carry = 0;
            if(add > b){
                carry = carry(b,add);
                int remVal = rem(b,add);
                sum += remVal * (int)Math.pow(10,pow);
            }
            else {
                sum += add * (int)Math.pow(10,pow);

            }
            if(n1 > 0){
                n1/=10;
            }
            if(n2 > 0){
                n2/=10;
            }
            pow++;


        }
        if(carry > 0){
            sum = sum + carry * (int)Math.pow(10,pow);
        }
        return sum;
    }
    public static int rem(int b, int add){
        int carry = 0;
        while(add >= b){
            add -= b;
            carry++;
        }
        return add;
    }
    public static int carry(int b, int add){
        int carry = 0;
        while(add >= b){
            add -= b;
            carry++;
        }
        return carry;
    }
}
