import java.util.Scanner;

//import static java.lang.Math.pow;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        System.out.println("enter the number of rotatation");
        int k = in.nextInt();



        int rDig = 0;
        int Nnum = num;
        while(Nnum != 0){
            rDig ++;
            Nnum/=10;
        }

        boolean ispositive = true;
        if(k < 0) {
            k = rDig + k;
            if(k < 0){
                k = -k;

            }
            System.out.println("k is " + k);
        }

        if(k > rDig){
            k = k%rDig;
            System.out.println(k);
        }

        int pow = 1 *(int)Math.pow(10,k);
        int tpow = 1 * (int)Math.pow(10,rDig-1);

        int rPow = tpow * 10/pow;
        System.out.println("pow " + pow + "  rPow " + rPow + "  tpow " + tpow);

//        if(ispositive) {
            int rem = num % pow;
            num /= pow;
            rem *= rPow;
            System.out.println(rem + " is remaining");
            num = rem + num;
//        }
        System.out.println(num);
    }
}
