import java.util.Scanner;

public class printEncoding {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printEncodings(str,"");
    }

    public static void printEncodings(String str, String afn) {
        if(str.length() == 0){
            System.out.println(afn);
            return;
        }
        if(str.charAt(0) == '0'){
            return;
        }


        String fst = str.substring(0,1);
        int fnum = Integer.parseInt(fst) + 96;
        if(fnum > 0){
            char fch = (char)fnum;
            printEncodings(str.substring(1),afn + fch);
        }


        if(str.length() >= 2){
            String sst = str.substring(0,2);
            int snum = Integer.parseInt(sst);
            if(snum <= 26 && snum >= 10){
                char sch = (char)(snum + 96);
                printEncodings(str.substring(2),afn + sch);
            }
        }


    }
}
