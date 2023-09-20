import java.util.Scanner;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int result = 0;
        int pow = 0;
        while (n != 0){
            int rem = n%b;
            result += rem * (int)Math.pow(10,pow);
            n/=b;
            pow++;
        }
        return result;
    }
}
//1010110110