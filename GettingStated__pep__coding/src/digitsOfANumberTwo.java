import java.util.Scanner;

public class digitsOfANumberTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int dig = 0;
        int nNum = num;
        while(nNum != 0){
            nNum /= 10;
            dig++;
        }

        int div = 1;
        for (int i = 0; i < dig - 1; i++) {
            div = div * 10;
        }


        while(div != 0){
            int rem = num / div;
            System.out.println(rem);
            num = num % div;
            div = div/10;
        }
    }
}
