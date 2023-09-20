import java.util.Scanner;

public class digitsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        int nNum = 0;
        while(num != 0){
           int rem = num % 10;
           nNum = nNum * 10 + rem;
           num /= 10;
        }
//        System.out.println(nNum);
        while(nNum != 0){
            int rem = nNum % 10;
            System.out.println(rem);
            nNum /= 10;
        }
    }
}
