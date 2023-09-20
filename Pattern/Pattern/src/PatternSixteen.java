import java.util.Scanner;

public class PatternSixteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sp = 2*n - 3;
        int st = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j+ "\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            if(i != n){
            for (int j = i; j >= 1; j--) {

                System.out.print(j+ "\t");
            }
        }else {
                for (int j = i-1; j >= 1; j--) {
                    System.out.print(j + "\t");
                }
            }



            st++;
            sp-=2;
            System.out.println();
        }
    }
}
