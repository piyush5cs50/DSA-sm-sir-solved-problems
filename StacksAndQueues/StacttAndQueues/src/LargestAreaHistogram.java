import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int arr[] = {6, 2, 5, 4, 5, 1, 6};
        int[] righArr = smOnRigh(arr);
        int[] leftArr = smOnLeft(arr);
        int[] LH = new int[arr.length];

        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < LH.length; i++) {
            LH[i] = (righArr[i] + leftArr[i]) * arr[i];
            if(LH[i] > lar){
                lar = LH[i];
            }
        }
        System.out.println(lar);
    }

    public static int[] smOnLeft(int[] arr){
        Stack<Integer> st = new Stack<>();

        int STR[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (st.size() != 0 && arr[i] < arr[st.peek()]) {

                st.pop();
            }

            if(st.size() == 0){
                STR[i] = i;
            }
            else
                STR[i] = i - st.peek() - 1;

            st.push(i);
        }
//        while (st.size() != 0) {
//            STR[st.peek()] =arr.length - st.peek();
//            st.pop();
//        }


        return STR;
    }
    public static int[] smOnRigh(int[] arr){
        Stack<Integer> st = new Stack<>();

        int STR[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (st.size() != 0 && arr[i] < arr[st.peek()]) {
                STR[st.peek()] = i - st.peek();
                st.pop();
            }

            st.push(i);
        }
        while (st.size() != 0) {
            STR[st.peek()] =arr.length - st.peek();
            st.pop();
        }


        return STR;
    }

}