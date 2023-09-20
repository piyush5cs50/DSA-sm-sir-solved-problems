import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextSmallerElementToTheRight {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr){
        int nge[] = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < nge.length; i++) {
            while(st.size() > 0 && arr[i] < arr[st.peek()]){
                nge[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0){
            nge[st.peek()] = -1;
            st.pop();
        }

        return nge;
    }
}
