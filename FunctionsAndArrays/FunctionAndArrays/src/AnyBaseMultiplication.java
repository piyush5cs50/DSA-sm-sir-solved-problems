import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2){

        int res = 0;
        int p = 1;
        while (n2 > 0){
            int d2 = n2%10;
            n2/=10;

            int sPro = getSingledigitProduct(b,n1,d2);
            res = getSum(b,sPro * p, res);
            p = p * 10;
        }
        return res;
    }

    public static int getSingledigitProduct(int b, int n1, int d2){

        int p = 1;
        int rs = 0;
        int c = 0;
        while (n1 > 0){
            int d1 = n1%10;
            n1/=10;
            int d = d1 * d2 + c;
            c = d / b;
            d = d%b;

            rs = rs + d * p;
            p = p * 10;
        }
        return rs;

    }

    public static int getSum(int b, int n1, int n2){
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
