import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        ArrayList<String> sequences = gss("abc");
        for (String sequence: sequences) {
            System.out.println(sequence);
        }
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> returnArray = new ArrayList<>();
            returnArray.add("");
            return returnArray;
        }

        ArrayList<String> returnArray = gss(str.substring(1,str.length()));
        ArrayList<String> newArrayList = new ArrayList<>();
        for (String element:returnArray) {
            newArrayList.add(str.charAt(0) + element);
        }
        for (String element:returnArray) {
            newArrayList.add(element);
        }
        return newArrayList;
    }
}
