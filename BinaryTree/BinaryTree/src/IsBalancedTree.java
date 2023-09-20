import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class IsBalancedTree {
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

    static boolean isBalanced;
    public static int isBalancedTree(Node node){

        if(node ==null){
            return  0;
        }

        int LS = isBalancedTree(node.left);
        int RS = isBalancedTree(node.right);

        int retH = Math.max(LS, RS);
        if(Math.abs(LS - RS) > 1)
            isBalanced = false;

        return retH + 1;
    }

    public static class BAlPair{
        boolean isBalanced;
        int height;
    }

    public static BAlPair isBalanced2(Node node){
        if(node == null){
            BAlPair newBAl = new BAlPair();
            newBAl.isBalanced = true;
            newBAl.height = 0;
            return newBAl;
        }

        BAlPair LS = isBalanced2(node.left);
        BAlPair RS = isBalanced2(node.right);


        BAlPair NBAl = new BAlPair();
        if(LS.isBalanced == false || RS.isBalanced == false || (Math.abs(LS.height - RS.height) > 1))
        NBAl.isBalanced = false;
        else
            NBAl.isBalanced = true;
        NBAl.height = Math.max(LS.height, RS.height) + 1;

        return NBAl;
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

        // write your code here

//        isBalanced = true;
//        int ans = isBalancedTree(root);
//
//        System.out.println(ans);
//        System.out.println(isBalanced);


        BAlPair RetBal = isBalanced2(root);
        System.out.println(RetBal.isBalanced);
    }
}
