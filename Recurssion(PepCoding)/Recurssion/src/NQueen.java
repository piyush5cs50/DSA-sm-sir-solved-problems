import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int[][] chess = new int[l][l];
        printNQueens(chess,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
    if(row == chess.length){
        System.out.println(qsf + ".");
        return;
    }

        for (int col = 0; col < chess.length; col++) {

            if(queenIsSafe(chess,row, col) == true){
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        }
    }
    static boolean queenIsSafe(int[][] chess, int row, int col){
        for (int i = row - 1 , j = col; i >= 0; i--) {
          if(chess[i][j] == 1){
              return false;
          }
        }

        for (int i = row - 1 , j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(chess[i][j] == 1){
                return false;
            }
        }

        for (int i = row - 1 , j = col+1; i >= 0 && j < chess[0].length; i--, j++) {
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
