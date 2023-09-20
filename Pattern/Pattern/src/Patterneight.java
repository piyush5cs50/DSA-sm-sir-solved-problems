import java.util.Scanner;

public class Patterneight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int j = 1; j <= n; j++){
            for (int i = n; i >= 1; i--) {
                if(i == j){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
