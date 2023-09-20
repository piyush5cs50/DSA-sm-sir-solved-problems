import java.util.Scanner;

public class allIndices {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int[] arr = {3,3,3,5,3,4};


//        int x = in.nextInt();
        int[] iarr = allIndices(arr, 3, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length){
//            int[] returnArray = new int[fsf];
            return new int[fsf];
        }

        if(arr[idx] == x){
            int[] returnArr = allIndices(arr, x, idx +1,fsf + 1);
            returnArr[fsf] = arr[idx];
            return returnArr;
        }
         int[] returnArr = allIndices(arr, x, idx +1,fsf);
         return  returnArr;


    }

}
