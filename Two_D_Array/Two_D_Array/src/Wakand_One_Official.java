import java.util.Scanner;

public class Wakand_One_Official {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int[][] newArr = new int[r][c];
        for (int i = 0; i < newArr[0].length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                System.out.println(arr[j][i]);
            }
            if(i <= newArr[0].length-1)
            i++;
            for (int j = newArr.length-1; j >= 0; j--) {
                System.out.println(arr[j][i]);
            }
        }

    }
}