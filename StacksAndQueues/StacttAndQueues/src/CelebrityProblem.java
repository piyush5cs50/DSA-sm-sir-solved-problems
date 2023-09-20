import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class CelebrityProblem {
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

        Stack<Integer> people = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            people.push(i);
        }

        while(people.size() > 1){
            int p1 = people.pop();
            int p2 = people.pop();

            if(arr[p1][p2] == 1){
                people.push(p2);
            }
            else
                people.push(p1);
        }

            int p = people.peek();
            for (int i = 0; i < arr.length; i++) {
                if(p != i){
                    if(arr[i][p] == 0 || arr[p][i] == 1){
                        System.out.println("none");
                        return;
                    }
            }
        }

        System.out.println(p);

    }
}
