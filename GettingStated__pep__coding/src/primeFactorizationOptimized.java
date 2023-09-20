import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class primeFactorizationOptimized {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int div = 2; div*div <= num; div++) {
            while(num % div == 0){
                num = num / div;
                System.out.println(div);
            }
            if(num == 1){
                break;
            }
        }
        if(num != 1){
            System.out.println(num);
        }
    }
}
