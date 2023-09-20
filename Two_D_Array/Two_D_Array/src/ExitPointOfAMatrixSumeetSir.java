import java.util.Scanner;

public class ExitPointOfAMatrixSumeetSir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int dir = 0;
        int i = 0;
        int j = 0;

        while(true){
            dir = (dir + arr[i][j]) % 4;
            
            if(dir == 0){
                j++;
            }
            else if(dir == 1){
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }

            if(i < 0){
                i++;
            break;
            } else if (i == arr.length) {
                i--;
                break;
            } else if (j == arr[0].length) {
                j--;
                break;
            } else if (j < 0) {
                j++;
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);
    }
}
