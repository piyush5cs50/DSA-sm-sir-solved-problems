import java.util.ArrayList;

public class getMazePathWithJumps {
    public static void main(String[] args) throws Exception {
     ArrayList<String> steps = getMazePaths(0,0, 3,3);
        System.out.println(steps);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc == dc && sr == dr) {
            ArrayList<String> newArray = new ArrayList<>();
            newArray.add(" ");
            return newArray;
        }else if (sc > dc && sr > dr){
            ArrayList<String> newArray = new ArrayList<>();
            return newArray;
        }


        ArrayList<String> newArray = new ArrayList<>();

        for (int i = 1; i <= dc - sc; i++) {
            ArrayList<String> paths1 = getMazePaths(sr, sc + i, dr, dc);
            for (String path: paths1){
                newArray.add("h" + i + path);
            }
        }

        for (int i = 1; i <= dr - sr; i++) {
            ArrayList<String> paths3 = getMazePaths(sr+i, sc, dr, dc);
            for (String path: paths3) {
                newArray.add("v"+ i + path);
            }
        }

        for (int i = 1; i <= dr - sr && i <= dc - sc; i++) {
            ArrayList<String> paths3 = getMazePaths(sr+i, sc + i, dr, dc);
            for (String path: paths3) {
                newArray.add("d" + i + path);
            }
        }

        return newArray;
    }
}
