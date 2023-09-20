import java.util.Scanner;

public class PatternNinteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sp = n/2;
        int st = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sp; j++) {
                if(i == n/2 + 1 || i == 1){
                    System.out.print("*\t");
                }else if (j == 1 && i > n/2) {
                    System.out.print("*\t");
                }
                else
                System.out.print("\t");

            }
            System.out.print("*\t");

            for (int j = 1; j <= sp; j++) {
                if(i == n/2 + 1 || i == n){
                    System.out.print("*\t");
                } else if (j == sp && i <= n/2) {
                    System.out.print("*\t");
                } else
                    System.out.print("\t");
            }

            System.out.println();
        }
    }
}
