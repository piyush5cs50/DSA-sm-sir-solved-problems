import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n = in.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the Enement to be found: ");

        int val = in.nextInt();

        int l = 0;
        int h = arr.length-1;
        int ceil,floor;

        while (l <= h){
            int m = (l + h)/2;

            if(val > arr[m]){
                if(m < arr.length && val < arr[m + 1]){
                    floor = arr[m];
                    ceil = arr[m + 1];
                    System.out.println("Floor " + floor + " Celing " + ceil);
                    return;
                }
                l = m+1;
            } else if (val < arr[m]) {
                if(m > 0 && val > arr[m-1]){
                    floor = arr[m-1];
                    ceil = arr[m];
                    System.out.println("Floor " + floor + " Celing " + ceil);

                    return;
                }
                h = m -1;
            }
            else{
                floor = arr[m];
                ceil = arr[m];
                System.out.println("Floor " + floor + " Celing " + ceil);

                return;
            }
        }
        System.out.println(-1);
    }
}
