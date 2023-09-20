import java.util.Scanner;

public class printMazePaths {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int drow = in.nextInt();
        int dcol = in.nextInt();
        printMazePaths(0,0,drow, dcol, "");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
      if(sr == dr && sc == dc){
          System.out.println(psf);
          return;
      }

        if(sr < dr){
            printMazePaths(sr + 1, sc,dr,dc,psf + "h");
        }
        if(sc < dc){
            printMazePaths(sr, sc + 1,dr,dc,psf + "v");
        }
    }
}
