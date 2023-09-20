import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while (num != 0){
            int rem = num%10;
            System.out.println(rem);
            num /= 10;
        }
    }
}
