import java.util.Scanner;

public class firstIndex {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("length of an array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int index = firstIndex(arr, 0, arr[3]);
        System.out.println(index);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == x){
            return idx;
        }
        int index = firstIndex(arr, idx + 1, x);

        return index;
    }
}
