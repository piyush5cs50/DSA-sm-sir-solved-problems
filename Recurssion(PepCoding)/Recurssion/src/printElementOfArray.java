import java.util.Scanner;

public class printElementOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};

        printElement(arr, 0);

    }
    public static void printElement(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        printElement(arr, index +1);


    }
}
