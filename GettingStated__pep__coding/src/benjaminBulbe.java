import java.util.Scanner;

public class benjaminBulbe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nBulb = in.nextInt();

        for (int i = 1; i*i <= nBulb; i++) {
            System.out.println(i * i);
        }
    }
}
