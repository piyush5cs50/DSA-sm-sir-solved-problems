import java.util.Scanner;

public class SpiralDisplay {
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

        int rS = 0;
        int rE = arr.length;
        int cS = 0;
        int cE = arr[0].length;
        int tne = r * c;
        int count = 0;
        while(count < tne){
            for (int i = rS; i < rE && count< tne; i++) {
                System.out.println(arr[i][cS]);
                count++;
            }
            cS++;

            for (int i = cS; i < cE && count< tne; i++) {
                System.out.println(arr[rE-1][i]);
                count++;
            }
            rE--;

            for (int i = rE -1; i >= rS && count< tne; i--) {
                System.out.println(arr[i][cE-1]);
                count++;
            }
            cE--;

            for (int i = cE -1; i >= cS  && count< tne; i--) {
                System.out.println(arr[rS][i]);
                count++;
            }
            rS++;
        }
    }
}
