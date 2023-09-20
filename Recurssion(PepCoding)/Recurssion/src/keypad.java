import java.util.ArrayList;
import java.util.Scanner;

public class keypad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        String num = in.next();

//        char ch = '3';
//        int numb = '0';
//        System.out.println(numb);

        String[] key = {"?!","abc", "def", "jhi", "jkl", "mnop", "qrst", "uv", "wxyz", ".,"};

        ArrayList<String> returnedArray = key(key,num);
        System.out.println(returnedArray);
    }
    public static ArrayList<String> key(String[] keys, String num){
        if(num.length() == 0){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(" ");
            return arr;
        }

        int firstChar = num.charAt(0) - '0';
        ArrayList<String> returnedArray = key(keys,num.substring(1));
        ArrayList<String> newArray = new ArrayList<>();
        String str = keys[firstChar];
        for (int i = 0; i < returnedArray.size(); i++) {
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                newArray.add(ch + returnedArray.get(i));
            }
        }
        return newArray;
    }
}
