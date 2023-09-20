import java.util.Scanner;

public class PatternTweenty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int st = 1;
        int sp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if(i <= n/2 || i == n){
                    if(j == 1 || j == n){
                        System.out.print("*\t");
                    }
                    else
                        System.out.print("\t");
                }
                else if(i == n/2 + 1){
                    if(j == 1 || j == n || j == n/2 + 1){
                        System.out.print("*\t");
                    }
                    else
                        System.out.print("\t");
                }
                else if(i > n/2 + 1 && i < n){
                    int val = i - ((n/2)+1);
                    if(j == n/2 + 1 - val || j == n/2 + 1 + val || j == 1 || j == n)
                    System.out.print("*\t");
                    else
                        System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
}
