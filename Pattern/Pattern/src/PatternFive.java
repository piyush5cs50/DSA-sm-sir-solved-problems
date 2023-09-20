import java.util.Scanner;

public class PatternFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sp = n/2;
        int st = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if(i <= (n/2)){
                st+=2;
                sp--;
            }
            else {
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }
}
