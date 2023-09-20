import java.util.Scanner;

public class DifferenceOfArrays {
    public static void main(String[] arr){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int arr1[] = new int[n1];

        for(int i = 0;i<n1;i++){
            arr1[i] = in.nextInt();
        }

        int n2 = in.nextInt();

        int arr2[] = new int[n2];

        for(int i = 0;i < n2;i++){
            arr2[i] = in.nextInt();
        }

        int sum[] = new int[n2];

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;
        int c = 0;
        while(k >= 0){
            int d1 = 0;
            if(i >= 0){
                d1 = arr1[i];
            }

            int d2 = arr2[j];
            d2+=c;
            c = 0;

            if(d2 < d1){
                c--;
                d2+= 10;
            }


            d2 = d2 - d1;

            System.out.println(d2 + " - " + d1 + " = " + (d2 - d1));
            sum[k] = d2;
            i--;
            j--;
            k--;
        }

        boolean startzero = true;
        for (int l = 0; l < sum.length; l++) {
            if(sum[l] == 0 && startzero == false){
                System.out.print(sum[l]);
            }
            else if(sum[l] != 0 && startzero == true){
                startzero = true;
                System.out.print(sum[l]);
            }
            else {
                continue;
            }
        }
    }
}
