import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        for (int i = max; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if(arr[j-1] >= i){
                    System.out.print("*\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
