public class Rough {
    public static void main(String[] args) {


    int val = 105;
    int ans = 0;

    int multiple = 1;
    while(val > 0){
        int mod = val % 2;
        val /= 2;
        ans = multiple * mod + ans;
        multiple *= 10;
    }

        System.out.println(ans);
    }
}
