import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=  in.nextInt();
        int Arr[] = new int[n];

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = in.nextInt();
        }

        for (int i = 0; i < Arr.length; i++) {
            for (int j = i; j < Arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(Arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
