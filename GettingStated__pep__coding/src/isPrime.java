import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            boolean isPrime = true;
            for (int j = 2; j * j <= n; j++) {
                if(n % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(n + " is a prime number");
            else
                System.out.println(n + " is not a prime number");
        }
    }
}
