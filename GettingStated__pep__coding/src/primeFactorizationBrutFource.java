import java.util.Scanner;

public class primeFactorizationBrutFource {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 2;
        while (num != 1){
            boolean isPrime = isPrime(i);
            if(isPrime && num%i == 0){
                num = num / i;
                System.out.println(i);
            }
            if(num%i != 0){
                i++;
            }
        }
    }
    public static boolean isPrime(int n){
        boolean isprime = true;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                count++;
            }
            if(count > 2){
                isprime = false;
                break;
            }
        }
        return isprime;
    }
}
