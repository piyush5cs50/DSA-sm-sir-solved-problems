import java.util.Scanner;

public class PatternEightSumitSir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 1; j <= n; j++){
            for (int i = 1; i <= n; i++) {
                if(i + j == n + 1){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
