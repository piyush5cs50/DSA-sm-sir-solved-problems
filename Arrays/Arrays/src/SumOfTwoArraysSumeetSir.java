import java.util.Scanner;

public class SumOfTwoArraysSumeetSir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();

        int arr1[] = new int[n1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        int n2 = in.nextInt();

        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }

        int sum[] = new int[n1 > n2 ? n1: n2];

        int c =0;
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;

        while (k >= 0){
            int d = c;
            if(i >= 0){
                d += arr1[i];
            }
            if(j >= 0){
                d += arr2[j];
            }

            c = d/10;
            d = d%10;

            sum[k] = d;
            i--;
            j--;
            k--;
        }
        
        if(c != 0){
            System.out.println(c);

        }

        for (int l = 0; l < sum.length; l++) {
            System.out.println(sum[l]);
        }
    }
}
