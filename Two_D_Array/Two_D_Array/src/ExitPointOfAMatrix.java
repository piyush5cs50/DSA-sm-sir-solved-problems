import java.util.Scanner;

public class ExitPointOfAMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();

        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] );
            }
            System.out.println();
        }

        int i = 0;
        int j = 0;
        while(i >=0 && i < arr.length && j >= 0 && j < arr[0].length){

            while (j < arr[0].length-1 && arr[i][j] != 1 ){
                System.out.println(arr[i][j]);
                j++;
            }

            if(j < arr[0].length && arr[i][j] == 1){
                System.out.println(arr[i][j]);
                i++;
            }
            else {
//                j--;
                break;
            }


            while(i < arr.length && arr[i][j] != 1){
                System.out.println(arr[i][j]);
                i++;
            }

            if(i < arr.length && arr[i][j] == 1){
                System.out.println(arr[i][j]);
                j--;
            }
            else {
//                i--;
                break;
            }


            while(j >= 0 && arr[i][j] != 1){
                System.out.println(arr[i][j]);
                j--;
            }

            if(j >= 0  && arr[i][j] == 1){
                System.out.println(arr[i][j]);
                i--;
            }
            else {
//                j++;
                break;
            }


            while(i >= 0 && arr[i][j] != 1){
                System.out.println(arr[i][j]);
                i--;
            }

            if(i >= 0 && arr[i][j] == 1){
                System.out.println(arr[i][j]);
                j++;
            }
            else {
//                i++;
                break;
            }
        }

        System.out.println("i-j coordinates are " + i + " " + j);
    }
}
