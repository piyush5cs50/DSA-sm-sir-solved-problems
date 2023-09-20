import java.util.Scanner;

public class printMazsPaths {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int dr = in.nextInt();
        int dc = in.nextInt();
        printMazePaths(1,1,dr,dc, " ");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        else if(sr > dr || sc > dc){
            return;
        }

        for (int i = 1; i <= dr - sr; i++) {
            printMazePaths(sr + i,sc, dr, dc, psf + "v" + i);
        }

        for (int i = 1; i <= dr - sr && i <= dc - sc; i++) {
            printMazePaths(sr + i,sc + i, dr, dc, psf + "d" + i);
        }

        for (int i = 1; i <= dc - sc; i++) {
            printMazePaths(sr ,sc + i, dr, dc, psf + "h" + i);
        }
    }
}
