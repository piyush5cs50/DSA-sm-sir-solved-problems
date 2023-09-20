import java.util.Scanner;

public class KnightTour {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        System.out.println("chess board length");
        int l = in.nextInt();
        int[][] chess = new int[l][l];
        System.out.println("enter the row and col");
        int r = in.nextInt();
        int c = in.nextInt();

        printKnightsTour(chess, r,c,1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        if(r < 0 || r >= chess.length || c < 0 || c >= chess.length || chess[r][c] > 0){
            System.out.println('c');
            return;
        }else if(upcomingMove == chess.length *chess.length){
            chess[r][c] = upcomingMove;
            System.out.println('e');
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }



        chess[r][c] = upcomingMove;
        printKnightsTour(chess,r-2,c+1,upcomingMove+1);
        printKnightsTour(chess,r-1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+1,c+2,upcomingMove+1);
        printKnightsTour(chess,r+2,c+1,upcomingMove+1);
        printKnightsTour(chess,r+2,c-1,upcomingMove+1);
        printKnightsTour(chess,r+1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-1,c-2,upcomingMove+1);
        printKnightsTour(chess,r-2,c-1,upcomingMove+1);
        chess[r][c] = 0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
