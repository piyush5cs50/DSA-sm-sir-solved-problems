import java.util.Scanner;

public class maxOfAnArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("length of an array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }


        int max = maxElement(arr, 0);
        System.out.println(max);
    }


    public static int maxElement(int[] arr, int index){
        if(index == arr.length){
            return -99999;
        }
        int maxEle = maxElement(arr, index+1);
        if(arr[index] > maxEle) {
            maxEle = arr[index];
        }


        return maxEle;
    }
}
