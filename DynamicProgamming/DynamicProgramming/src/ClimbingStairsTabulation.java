import java.util.Scanner;

public class ClimbingStairsTabulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(stairsCount(n));
    }

    public static int stairsCount(int n){
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }

        int qb[] = new int[n+1];
        qb[0] = 1;

        for (int i = 1; i <= n; i++) {
            qb[i] += qb[i-1];
            if(i >= 2){
                qb[i] += qb[i-2];
            }
            if (i >= 3) {
                qb[i] += qb[i-3];
            }
        }

        return qb[n];
    }
}
