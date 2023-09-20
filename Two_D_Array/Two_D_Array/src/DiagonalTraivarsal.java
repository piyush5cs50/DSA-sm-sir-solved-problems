import java.util.Scanner;

public class DiagonalTraivarsal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int [][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr[0].length; i++) {
            int temp = i;
            int j = 0;
            while(i < arr[0].length && j < arr.length) {
                System.out.println(arr[j][i]);
                j++;
                i++;
            }
            i = temp;
        }
    }
}


