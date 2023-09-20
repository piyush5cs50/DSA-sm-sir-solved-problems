import java.util.Scanner;

public class climbStairsMemoization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int qb[] = new int[n+1];
        System.out.println(numberOfWays(n, qb));
    }

    public static int numberOfWays(int n, int[] qb){
        if(n == 0){
            return 1;
        } else if (n < 0) {
            return 0;
        }

        if(qb[n] != 0){
            return qb[n];
        }

        int p1 = numberOfWays(n-1,qb);
        int p2 = numberOfWays(n-2, qb);
        int p3 = numberOfWays(n-3, qb);

        int numberOfSteps = p1+p2+p3;
        qb[n] = numberOfSteps;
        return numberOfSteps;
    }
}
