import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int num = in.nextInt();

        System.out.println( findNum(arr,num));

    }
    public static int findNum(int[] arr, int num){
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                idx = i;
                break;
            }
        }
        return idx;
    }
}
