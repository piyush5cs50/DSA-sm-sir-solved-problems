import java.util.Scanner;

public class printElemantOfArrayDecreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("length of an array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        printElementReverse(arr, 0);
    }
    public static void printElementReverse(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        printElementReverse(arr, index+1);
        System.out.println(arr[index]);
    }

}
