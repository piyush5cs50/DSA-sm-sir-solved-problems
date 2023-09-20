import java.util.Scanner;

public class PrintInLexicographicalOrder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i < 10; i++) {
           print(i,n);
        }

    }

    public static void print(int i,int n){
        if(i > n){
            return;
        }

        System.out.println(i);
        for (int j = 0; j < 10; j++) {
            print(i * 10 + j,n);
        }
    }
}
