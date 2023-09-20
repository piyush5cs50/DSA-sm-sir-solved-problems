import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("num of r and c");
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("arr[" + i + ',' + j + "] is");
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {
        if(sr == maze.length - 1 && sc == maze[0].length -1){
            System.out.println('e');
            System.out.println(asf);
        }

        boolean a = sr == 0 || maze[sr - 1][sc] == 1;
        boolean b = sr == maze.length-1 || maze[sr + 1][sc] == 1;
        boolean c = sc == 0 || maze[sr][sc - 1] == 1;
        boolean d = sc == maze[0].length - 1 || maze[sr][sc + 1] == 1;
        if(a && b && c && d){
            return;
        }

        // Top
        if(sr != 0 && maze[sr-1][sc] == 0){
            maze[sr][sc] = 1;
            floodfill(maze,sr-1,sc,asf + 't');
            maze[sr][sc] = 0;
        }

        // Left
        if(sc != 0 && maze[sr][sc-1] == 0){
            maze[sr][sc] = 1;
            floodfill(maze,sr,sc-1,asf + 'l');
            maze[sr][sc] = 0;
        }

        // Bottm
        if(sr != maze.length -1 && maze[sr+1][sc] == 0){
            maze[sr][sc] = 1;
            floodfill(maze,sr+1,sc,asf + 'b');
            maze[sr][sc] = 0;
        }

        // Right
        if(sc != maze[0].length -1 && maze[sr][sc+1] == 0){
            maze[sr][sc] = 1;
            floodfill(maze,sr,sc+1,asf + 'r');
            maze[sr][sc] = 0;
        }

    }
}
