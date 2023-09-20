import java.util.Scanner;

public class InverseOfANumberBrutFource {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int dig = 0;
        int nNum = num;
        while(nNum != 0){
            dig++;
            nNum /= 10;
        }

        int count = 0;
        for (int i = 1; i <= dig; i++) {
            boolean hasFind = false;
            int nNNum = num;
            while(!hasFind && nNNum != 0){
                int rem = nNNum % 10;
                if(rem == i){
                    hasFind = true;
                    count++;
                    break;
                }
                nNNum /= 10;
            }
        }

        boolean isRange = false;
        if(count == dig){
            isRange = true;
        }

        String retNumber = "";

        for (int i = 1; i <= dig; i++) {
            int nNNum = num;
            for (int j = 1; j <= dig; j++) {
                int rem = nNNum%10;
                if(rem == i){
                    retNumber =retNumber + j;
                    break;
                }
                nNNum/=10;
            }
        }
        System.out.println(retNumber);
    }
}
