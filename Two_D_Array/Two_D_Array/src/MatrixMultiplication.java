import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int m1 = in.nextInt();

        int[][] arr1 = new int[n1][m1];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = in.nextInt();
            }
        }


        int n2 = in.nextInt();
        int m2 = in.nextInt();

        int[][] arr2 = new int[n2][m2];


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = in.nextInt();
            }
        }


        if(n1 != m2){
            System.out.println("Invalid input");
            return;
        }


        System.out.println("Array one");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Array Two");
        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }




        int arr3[][] = new int[n1][m2];

        for (int z = 0; z < arr1.length; z++) {
            int sum = 0;
            int idx = 0;
            for (int i = 0; i < arr1[0].length; i++) {
                sum += arr1[z][i] * arr2[i][z];
            }
            arr3[z][idx] = sum;
            idx++;
            if(idx == arr3[0].length){
                idx = 0;
            }
        }


        System.out.println("result");
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
