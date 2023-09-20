import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class DiameterOfABinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static Node construct(Integer[] arr) {
        Node root = new Node(arr[0], null, null);
        Pair rtp = new Pair(root, 1);

        Stack<Pair> st = new Stack<>();
        st.push(rtp);

        int idx = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] != null) {
                    top.node.left = new Node(arr[idx], null, null);
                    Pair lp = new Pair(top.node.left, 1);
                    st.push(lp);
                } else {
                    top.node.left = null;
                }

                top.state++;
            } else if (top.state == 2) {
                idx++;
                if (arr[idx] != null) {
                    top.node.right = new Node(arr[idx], null, null);
                    Pair rp = new Pair(top.node.right, 1);
                    st.push(rp);
                } else {
                    top.node.right = null;
                }

                top.state++;
            } else {
                st.pop();
            }
        }

        return root;
    }

    public static void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";
        str += node.left == null ? "." : node.left.data + "";
        str += " <- " + node.data + " -> ";
        str += node.right == null ? "." : node.right.data + "";
        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    public static int height(Node node) {
        if (node == null) {
            return -1;
        }

        int lh = height(node.left);
        int rh = height(node.right);

        int th = Math.max(lh, rh) + 1;
        return th;
    }

    static int diameter2;
    static int diameter1;
    public static int diameter1(Node node) {
        if(node == null){
            return -1;
        }

        int LL = diameter1(node.left);
        int RL = diameter1(node.right);

        if(LL > RL){
            diameter2 = diameter1;
            diameter1 = LL+1;
            return diameter1;
        }
        else if(LL < RL){
            diameter2 = diameter1;
            diameter1 = RL+1;
            return diameter1;
        } else if (LL == RL) {
            diameter1 = LL+1;
            diameter2 = diameter1;
            return diameter1;
        }
        return diameter1;
    }

    public static int diameter2(Node node){
        if(node == null){
            return 0;
        }

        int LD = diameter2(node.left);
        int RD = diameter2(node.right);

        int f = height(node.left) + height(node.right) + 2;
        int res = Math.max(f, Math.max(LD, RD));

        return res;
    }

    public static class dia{
        int height;
        int dia;
    }

    public static dia diameter3(Node node){
        if(node == null){
            dia mp = new dia();
            mp.height = -1;
            mp.dia = 0;
            return mp;
        }

        dia LS = diameter3(node.left);
        dia RS = diameter3(node.right);

        dia retDia = new dia();
        retDia.height = Math.max(LS.height, RS.height) + 1;
        int fes = LS.height + RS.height + 2;
        retDia.dia = Math.max(fes,Math.max(LS.dia, RS.dia));
        return retDia;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (values[i].equals("n") == false) {
                arr[i] = Integer.parseInt(values[i]);
            } else {
                arr[i] = null;
            }
        }

        Node root = construct(arr);

        dia diameter = new dia();
        diameter2 = 0;
        diameter1 = 0;
        diameter = diameter3(root);
//        System.out.println(diameter);
//        System.out.println(diameter2);
        System.out.println(diameter.dia);
    }
}
