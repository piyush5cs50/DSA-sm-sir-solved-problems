import java.util.Scanner;

public class DigitFrequency {
    public  static int DigitF(int n, int num){
        int count = 0;
        while (n != 0){
            int rem = n%10;
            if(rem == num){
                count++;
            }
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = in.nextInt();

        int dF = DigitF(n,num);
        System.out.println(dF);
    }
}