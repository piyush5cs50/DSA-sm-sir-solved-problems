import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class rotateANumberOptimized {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k = in.nextInt();

        int nNum = num;
        int dig = 0;
        while(nNum != 0){
            dig++;
            nNum/=10;
        }

        if(k < 0){
            k = k + dig;
        }

        if(k > dig){
            k = k%dig;
        }

        int div = 1;
        int mul = 1;
        int n = num;
        int count = 1;
        while(n != 0){
            if(count <= k){
                div = div * 10;
            }
            else
                mul = mul * 10;
            n/=10;
            count++;
        }

        System.out.println(div + "  div  " + mul + "  mul ");

        int rem = num%div;
        int que = num/div ;
        System.out.println(rem + "  rem  " + que + " que");
        int res = rem * mul + que;
        System.out.println(res);
    }
}
