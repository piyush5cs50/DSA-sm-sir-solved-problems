import java.util.Scanner;

public class FirstIndexAndLastIndexSumeetSir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the value to find: ");
        int val = in.nextInt();


        int lo = 0;
        int hi = arr.length -1;
        int firstIndex = 0;

        while(lo <= hi){
            int mid = (lo + hi)/2;

            if(val > arr[mid]){
                lo = mid+1;
            } else if (val < arr[mid]) {
                hi = mid - 1;
            }
            else {
                firstIndex = mid;
                hi = mid -1;
            }
        }

        System.out.println(firstIndex);


         lo = 0;
         hi = arr.length -1;
        int lastIndex = 0;

        while(lo <= hi){
            int mid = (lo + hi)/2;

            if(val > arr[mid]){
                lo = mid+1;
            } else if (val < arr[mid]) {
                hi = mid - 1;
            }
            else {
                lastIndex = mid;
                lo = mid + 1;
            }
        }
        System.out.println(lastIndex);
    }
}
