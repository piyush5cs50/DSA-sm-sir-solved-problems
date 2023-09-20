import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class getStairsPath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of stairs");
        int n = in.nextInt();
        ArrayList<String> paths = path(n);
        System.out.println(paths);
    }
    public static ArrayList<String> path(int n){
        if(n == 0){
            ArrayList<String> newArray = new ArrayList<>();
            newArray.add(" ");
            return newArray;
        }
        if(n < 0){
            ArrayList<String> newArray = new ArrayList<>();
            return newArray;
        }

        ArrayList<String> paths1 = path(n-1);
        ArrayList<String> paths2 = path(n-2);
        ArrayList<String> paths3 = path(n-3);
        ArrayList<String> newArray = new ArrayList<>();

        for (String path: paths1) {
            newArray.add(1 + path);
        }
        for (String path: paths2) {
            newArray.add(2 + path);
        }
        for (String path: paths3) {
            newArray.add(3 + path);
        }

        return newArray;
    }
}
