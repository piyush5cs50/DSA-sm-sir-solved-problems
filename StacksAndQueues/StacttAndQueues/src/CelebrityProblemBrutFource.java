import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CelebrityProblemBrutFource {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"

        int ind = 0;
        boolean isCeleb = true;
        for (int i = 0; i < arr.length; i++) {
            isCeleb = true;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0 && i != j){
                    isCeleb = false;
                    ind = i;
                    break;
                }
            }
        }
        if(isCeleb == true)
        System.out.println(ind);
        else
            System.out.println("none");
    }
}

//4
//1011
//1101
//0000
//1110