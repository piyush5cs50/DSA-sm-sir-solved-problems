import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class LargestBSTSubTRee {
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

    public static class BST{
        boolean isBST;
        int min;
        int max;
        Node root;
        int size;
    }

    public static BST isBST(Node node){
        if(node == null){
            BST NBST = new BST();
            NBST.isBST = true;
            NBST.min = Integer.MAX_VALUE;
            NBST.max = Integer.MIN_VALUE;
            NBST.root = null;
            NBST.size = 0;
            return NBST;
        }

        BST Lbst = isBST(node.left);
        BST Rbst = isBST(node.right);

        BST NBST = new BST();
        NBST.isBST = (Lbst.isBST && Rbst.isBST && Lbst.max <= node.data && Rbst.min >= node.data);

        NBST.min = Math.min(node.data, Math.min(Lbst.min, Rbst.min));
        NBST.max = Math.max(node.data, Math.max(Lbst.max, Rbst.max));

        if(NBST.isBST){
            NBST.root = node;
            NBST.size = Lbst.size + Rbst.size + 1;
        } else if (Lbst.size >= Rbst.size ) {
            NBST.root = Lbst.root;
            NBST.size = Lbst.size;
        }else {
            NBST.root = Rbst.root;
            NBST.size = Rbst.size;
        }

        return NBST;
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
        BST retBST = isBST(root);
        System.out.println(retBST.root.data + "@" + retBST.size);
    }

}
