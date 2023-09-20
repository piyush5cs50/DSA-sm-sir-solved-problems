import java.util.Scanner;

public class pythgorousTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int sm1 = 0;
        int sm2 = 0;
        int p = 0;
        if(a > b){
            p = a;
            sm1 = b;
        }else{
            p = b;
            sm1 = a;
        }

        if(p > c){
            sm2 = c;
        }
        else{
            sm2 = p;
            p = c;
        }

        if(p*p == sm2*sm2 + sm1*sm1){
            System.out.println("is pytho");
        }
        else {
            System.out.println("not a pytho");
        }
    }
}
