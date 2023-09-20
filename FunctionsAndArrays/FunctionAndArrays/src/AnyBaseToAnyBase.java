import java.util.Scanner;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        int val = getValInDestBase(n,sourceBase,destBase);
        System.out.println(val);
    }
    public static int getValInDestBase(int n, int sb, int db){

        int dec = getValueIndecimal(n,sb);

        int sBase = getValueInBase(dec,db);

        return sBase;
    }

    public static int getValueIndecimal(int n, int b){
        int pow = 0;
        int result = 0;
        while(n != 0){
            int rem = n%10;
            n/=10;
            result = result + rem * (int)Math.pow(b,pow);

            pow++;
        }
        return result;
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
