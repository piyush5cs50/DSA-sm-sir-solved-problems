import java.io.*;
import java.util.*;

public class n__queen {

    public static void solve(boolean[][] board, int row, boolean[] columns, boolean[] hdiag, boolean[] vdiag, String afn){
        if(row == board.length){
            System.out.println(afn + '.');
            return;
        }


        for(int col = 0; col < board[0].length;col++){
            if((columns[col] == false && hdiag[row + col] == false && vdiag[row - col + board.length - 1]) == false){
                columns[col] = true;

                board[row][col] = true;

                hdiag[row + col] = true; vdiag[row -col + board.length -1 ] = true;

                solve(board, row+1, columns, hdiag, vdiag, afn + row + '-' + col + ',');

                columns[col] = false;

                hdiag[row + col] = false; vdiag[row -col + board.length -1 ] = false;
            }
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean[][] board = new boolean[n][n];
        boolean[] columns = new boolean[n];
        boolean[] hdiag = new boolean[2*n-1];
        boolean[] vdiag = new boolean[2*n-1];
        //write your code here
        solve(board, 0, columns, hdiag, vdiag, "");

    }

}