import java.util.Scanner;

public class AnyBaseAdditonSumeetSir {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2){
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
