import java.util.Scanner;

public class PatternFifteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sp = n/2;
        int spb = -1;
        int num = 1;
        for (int i = 1; i <= n; i++) {


            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }

            System.out.print(num + "\t");

            if(spb > 0){
                int count = 0;
                for (int j = 1; j <= spb; j++) {
                     if(j <= spb/2 + 1){
                         count++;
                     }
                     else count--;
                    System.out.print(num + count +"\t");
                }
            }

            if(i != 1 && i !=n){
                System.out.print(num + "\t");
            }

            if (i <= n/2){
                sp--;
                spb+=2;
                num++;
            }
            else {
                sp++;
                spb-=2;
                num--;
            }
            System.out.println();
        }
    }
}
