import java.util.Scanner;

public class PatternTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sp = n/2;
        int spB = -1;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" \t");
            }

            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }


            if(spB > 0){
                for (int j = 1; j <= spB; j++) {
                    System.out.print(" \t");
                }
            }

            if(i != 1 && i != n){
                for (int j = 1; j <= st; j++) {
                    System.out.print("*\t");
                }
            }




            if(i <= n/2){
                sp--;
                spB+=2;
            }
            else {
                sp++;
                spB-=2;
            }
            System.out.println();
        }
    }
}
