import java.util.Scanner;

public class RotateByNintyDegree {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
//        int c = in.nextInt();

        int[][] arr = new int[r][r];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


            for (int i = 0; i < arr.length; i++) {
                int low = 0;
                int hi = arr.length-1;
                while (low < hi){
                    int temp = arr[i][low];
                    arr[i][low] = arr[i][hi];
                    arr[i][hi] = temp;
                    low++;
                    hi--;
                }
            }

       display(arr);

    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
