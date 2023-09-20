import java.util.Scanner;

public class fibbonacci_dp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number to find factorial");
        int n = scn.nextInt();
        while(n != 0){
            int[] qb = new int[n+1];
            int fib = fibbonacci(n, qb);
            System.out.println(fib);

            System.out.println("Enter a number to find factorial");
            n = scn.nextInt();
        }


    }

    public static int fibbonacci(int n,int[] qb){
        if(n == 1 || n == 0){
            return n;
        }
        if(qb[n] != 0){
            return qb[n];
        }

        int fib1 = fibbonacci(n-1, qb);
        int fib2 = fibbonacci(n-2, qb);
        int fib = fib1+fib2;
        qb[n] = fib;
        return fib;
    }
}
