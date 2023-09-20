import java.util.Scanner;

public class ClimbeStairsWithMinimumMooves {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = in.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        Integer[] intArr = new Integer[n+1];
        intArr[n] = 0;

        for (int i = n-1; i >= 0; i--) {
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i+j < intArr.length; j++) {
                    if(intArr[i+j] != null) {
                        min = Math.min(min, intArr[i + j]);
                    }
                }

                if(min != Integer.MAX_VALUE){
                    intArr[i] = min+1;
                }
            }

        }

        System.out.println(intArr[0]);
    }
}
