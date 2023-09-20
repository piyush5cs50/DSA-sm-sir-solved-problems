import java.util.Scanner;

public class SubSetOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int noOfElements = (int)Math.pow(2, n);

        System.out.println(noOfElements);

        String formatString = "%0" + n + "d";

        for (int i = 0; i < noOfElements; i++) {
            int val = i;
            String stringAns = "";
            for(int j = arr.length -1; j >= 0; j--){
                int mod = val % 2;
                if(mod == 1){
                    stringAns = " " + arr[j] + stringAns;
                }
                else{
                    stringAns = " -" + stringAns;
                }
                val /= 2;
            }

            System.out.println("String " + stringAns);
        }
    }
}
