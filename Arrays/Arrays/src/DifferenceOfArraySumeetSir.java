import java.util.Scanner;

public class DifferenceOfArraySumeetSir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();

        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }

        int sub[] = new int[n2];

        int c=0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k= sub.length-1;

        while (k >= 0){
            int d = 0;
            int arr1v = i >=0 ? arr1[i] : 0;

            if(arr2[j] + c - arr1v >=  0){
                d = arr2[j] + c - arr1v;
                c=0;
            }else {
                d = arr2[j] + c + 10 - arr1v;
                c = -1;
            }

            sub[k] = d;
            i--;
            j--;
            k--;
        }

        int l = 0;
        while(l <= sub.length-1){
            if(sub[l] != 0){
                System.out.println(sub[l]);
                break;
            }
            l++;
        }
        l++;
        while (l <= sub.length-1){
            System.out.println(sub[l]);
            l++;
        }
    }
}
