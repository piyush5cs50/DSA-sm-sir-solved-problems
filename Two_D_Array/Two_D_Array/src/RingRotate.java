import java.util.ArrayList;
import java.util.Scanner;

public class RingRotate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }



        int s = in.nextInt();
        int r = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        rotate(arr,s,r);
        display(arr);
    }

    public static void rotate(int[][] arr,int s, int r){

        int oned[] = fillOneDFromShell(arr,s);

        System.out.println("OneD array");
        for (int i = 0; i < oned.length; i++) {
            System.out.print(oned[i] + " ");
        }


        oneDRotate(oned,r);

        System.out.println("\n OneD Roteded array");
        for (int i = 0; i < oned.length; i++) {
            System.out.print(oned[i] + " ");
        }

        fillShellFromOneD(oned,arr,s);

        System.out.println("After Filling shell from OneD array ");
        display(arr);

        System.out.println("\n \n");
    }

    public static void oneDRotate(int[] oneD, int r){
        r = r % oneD.length;

        reverse(oneD,0, oneD.length-r-1);
        reverse(oneD, oneD.length-r, oneD.length-1);
        reverse(oneD,0,oneD.length-1);
    }

    public static void reverse(int[] oneD, int S, int E){

        while (S < E) {
            int temp = oneD[S];
            oneD[S] = oneD[E];
            oneD[E] = temp;
            S++;
            E--;
        }

    }
    public static int[] fillOneDFromShell(int[][]arr,int s){
        int RS = s-1;
        int CS = s-1;
        int RE = arr.length - s;
        int CE = arr[0].length - s;
        int arrLen = 2 * (RE - RS + CE - CS);
        int oneD[] = new int[arrLen];

        int idx = 0;
        for (int i = RS,j = CS; i <= RE; i++) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        for (int i = RE, j = CS+1; j <= CE; j++) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        for (int i = RE-1, j = CE; i >= RS; i--) {
            oneD[idx] = arr[i][j];
            idx++;
        }

        for (int i = RS, j= CE-1; j > CS; j--) {
            oneD[idx] = arr[i][j];
            idx++;
        }
        return oneD;
    }

    public static void fillShellFromOneD(int[] oneD, int[][] arr, int s){
        int RS = s-1;
        int CS = s-1;
        int RE = arr.length - s ;
        int CE = arr[0].length - s;
//        int arrLen = RS + CS + RE + CE - 4;
//        int oneD[] = new int[arrLen];

        int idx = 0;
        for (int i = RS,j = CS; i <= RE; i++) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        for (int i = RE, j = CS+1; j <= CE; j++) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        for (int i = RE-1, j = CE; i >= RS; i--) {
            arr[i][j] = oneD[idx];
            idx++;
        }

        for (int i = RS, j= CE-1; j > CS; j--) {
            arr[i][j] = oneD[idx];
            idx++;
        }

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

//11 12 13 14 15 16 17
//21 25 26 36 46 45 27
//31 24 33 34 35 44 37
//41 23 22 32 42 43 47
//51 52 53 54 55 56 57