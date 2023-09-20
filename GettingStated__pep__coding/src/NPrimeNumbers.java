import java.util.Scanner;

public class NPrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter low and high");
        int low = in.nextInt();
        int high = in.nextInt();

        for (int i = low; i < high; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i + " is a prime number");
            else
                System.out.println(i + " is not a prime number");
        }

    }


}
