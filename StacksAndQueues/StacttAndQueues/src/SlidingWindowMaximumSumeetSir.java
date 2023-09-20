import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class SlidingWindowMaximumSumeetSir {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
       int k = Integer.parseInt(br.readLine());

//        greatest element to the right

        Stack<Integer> st = new Stack<>();
        int[] newArr = new int[a.length];

        for (int i = a.length-1; i >= 0; i--) {
            while (st.size() != 0 && a[i] >= a[st.peek()]){
                st.pop();
            }

            if(st.size() != 0){
                newArr[i] = st.peek();
            }else
                newArr[i] = a.length;

            st.push(i);
        }

        int j = 0;
        for (int i = 0; i <= a.length-k; i++) {
                if(j < i)
                    j = i;
                while(newArr[j] < i + k){
                    j = newArr[j];
                }

                System.out.println(a[j]);
        }

    }



}
