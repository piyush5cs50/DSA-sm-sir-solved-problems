import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the 3 pole names");
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();
//        System.out.println("enter the number of poles");
        int n = 3;
        transferDisk(n,t1,t2,t3);
    }
    public static void transferDisk(int n, int t1,int t2, int t3){
        if(n == 0){
            return;
        }

        transferDisk(n-1, t1, t3, t2);
        System.out.println(n + "[" + t1 + " -> " + t2 + "]" );
        transferDisk(n-1,t3, t2,t1);
    }
}
