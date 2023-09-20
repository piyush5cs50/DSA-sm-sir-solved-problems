import java.util.Scanner;

public class SumOfTwoArrays {
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

        int lg = 0;
        int sm = 0;
        int larr[];
        int sarr[];

        if(n1 > n2){
            lg = n1;
            sm = n2;
            larr = arr1;
            sarr = arr2;
        }
        else {
            lg = n2;
            sm = n1;
            larr = arr2;
            sarr = arr1;
        }


        int rrarr[] = new int[lg];
        int carry = 0;
        for (int i = sm-1 , j = lg-1; j >= 0; i--,j--) {
            int add = 0;
            if(i >= 0){
                add = larr[j] + sarr[i] + carry;
            }
            else
                add = larr[j] + carry;

            carry = add/10;
            int rem = add%10;
            rrarr[j] = rem;

        }

        for (int i = 0; i < lg; i++) {
            if(carry > 0){
                System.out.println(carry);
                carry = 0;
            }
            System.out.println(rrarr[i]);
        }
    }

}
