import java.util.Scanner;

public class PatternEleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }
    }
}
