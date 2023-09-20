import java.util.Scanner;

public class CeilAndFloorSumeetSir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the value to be found");
        int val = in.nextInt();

        int lo = 0;
        int hi = arr.length-1;
        int ceil = 0;
        int floor = 0;

        while(lo <= hi){
            int mid = (lo+hi)/2;

            if(val < arr[mid]){
                ceil = arr[mid];
                hi = mid -1;
            } else if (val > arr[mid]) {
                floor = arr[mid];
                lo = mid + 1;
            }
            else{
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }
}
