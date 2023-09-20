import java.util.Scanner;

public class InverseOfANumberOptimized {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int result = 0;
        int count = 0;
        while(num != 0){
            count++;
            int rem = num%10;
            result+= count * (int)Math.pow(10,rem-1);
            num/=10;
        }

        System.out.println(result);
    }
}
