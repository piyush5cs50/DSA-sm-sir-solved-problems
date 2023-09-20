import java.util.Scanner;

public class SaddleProble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[][] = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }



        for (int i = 0; i < arr.length; i++) {

            int svj = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if(arr[i][svj] > arr[i][j]){
                    svj = j;
            }
        }

            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][svj] > arr[i][svj]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("No Saddle Exist");
    }
}
