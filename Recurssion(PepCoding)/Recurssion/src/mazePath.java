import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) throws Exception {
        ArrayList<String> paths = getMazePaths(0,0,2,2);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> newArray = new ArrayList<>();
            newArray.add(" ");
            return newArray;
        }

        ArrayList<String> paths1 = new ArrayList<>();
        ArrayList<String> paths2 = new ArrayList<>();
        if(sc < dc){
            paths1 = getMazePaths(sr,sc + 1,dr,dc);
        }
        if(sr < dr){
            paths2 = getMazePaths(sr + 1,sc,dr,dc);
        }

        ArrayList<String> newArrayList = new ArrayList<>();

        for (String path: paths1) {
            newArrayList.add("h" + path);
        }
        for (String path: paths2) {
            newArrayList.add("v" + path);
        }

        return newArrayList;
    }
}
