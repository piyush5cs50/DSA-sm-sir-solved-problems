import java.util.Arrays;

public class AllIndicesOfArray {
    public static void main(String[] args) {
        int arr[] = {6,15,11 ,40,4,4,9,4};
        int x = 4;

        int ans[] = allIndice(arr, x, 0, 0);
        System.out.println(Arrays.toString(ans));
    }
    static int[] allIndice(int[] arr,int x ,int ixd , int count){
        if(ixd == arr.length){
            return new int[count];
        }
        if(arr[ixd] == x){
            int ans[] = allIndice(arr, x, ixd+1, count + 1);
            ans[count] = ixd;
            return ans;
        }
        else {
            int ans[] = allIndice(arr, x, ixd + 1, count);
            return ans;
        }

    }
}
