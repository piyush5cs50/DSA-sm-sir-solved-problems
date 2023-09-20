import java.util.Scanner;

public class SearchInATwoDSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int x = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int last = arr[0].length-1;
            if(arr[i][last] > x){
                for (int j = last; j >= 0; j--) {
                    if(arr[i][j] == x){
                        System.out.println(i);
                        System.out.println(j);
                        return;
                    }
                }
            } else if (arr[i][last] == x) {
                System.out.println(i);
                System.out.println(last);
            }

        }
        System.out.println("Number Not found in the array");
    }
}
