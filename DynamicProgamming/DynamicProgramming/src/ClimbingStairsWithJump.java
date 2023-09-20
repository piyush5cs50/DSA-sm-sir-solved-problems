import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairsWithJump {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int noOfPaths[] = new int[n+1];

        noOfPaths[n] = 1;
        for (int i = noOfPaths.length-2; i >= 0; i--) {
            int temp = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if(i+j < noOfPaths.length){
                    temp+= noOfPaths[i+j];
                }
            }
            noOfPaths[i] = temp;
        }
        System.out.println(Arrays.toString(noOfPaths));
    }

}
