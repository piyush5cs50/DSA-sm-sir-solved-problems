import java.util.Scanner;

public class TargetSumSet {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the target num");
        int target = in.nextInt();
        System.out.println("enter the array length");
        int l = in.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.println("Enter " + i + "th element of array");
            arr[i] = in.nextInt();
        }
        printTargetSumSubsets(arr, 0,"",0,target);

    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(idx == arr.length ){
            if(sos == tar){
                System.out.println(set + ".");
            }
                return;
        }


        printTargetSumSubsets(arr,idx+1,set + arr[idx] + ", ",sos + arr[idx],tar);
         printTargetSumSubsets(arr,idx+1,set,sos,tar);

    }
}
