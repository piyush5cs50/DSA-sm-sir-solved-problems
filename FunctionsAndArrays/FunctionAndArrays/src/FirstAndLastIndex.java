import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the value to be found: ");
        int val = in.nextInt();

        int lo = 0;
        int hi = arr.length -1;
        int firstInd = 0;
        int lastInd = arr.length-1;
        while(lo <= hi){
            int mid = (lo + hi)/2;

            if(val < arr[mid]){
                hi = mid - 1;
            } else if (val > arr[mid]) {
                lo = mid + 1;
            }
            else {
                firstInd = lastInd = mid;
                while(firstInd > 0 && arr[firstInd-1] == val){
                    firstInd -= 1;
                }
                while(lastInd < arr.length-1 && arr[lastInd+1] == val){
                    lastInd += 1;
                }
                break;
            }
        }
        System.out.println(firstInd);
        System.out.println(lastInd);
    }
}
