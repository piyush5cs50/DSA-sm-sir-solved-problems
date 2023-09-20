import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class IterativePrePostInOrderTraversal {
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


    public static void iterativePrePostInTraversal(Node node) {
        Stack<Pair> st = new Stack<>();
        Pair p = new Pair(node, 1);
        st.push(p);

        String pre = "";
        String pos = "";
        String in = "";


        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.state == 1) {
                top.state++;
                pre += top.node.data + " ";
                if (top.node.left != null) {
                    Pair LN = new Pair(top.node.left, 1);
                    st.push(LN);
                }
            } else if (top.state == 2) {
                top.state++;
                in += top.node.data + " ";
                if (top.node.right != null) {
                    Pair RN = new Pair(top.node.right, 1);
                    st.push(RN);
                }
            } else if (top.state == 3) {
                pos += top.node.data + " ";
                st.pop();

            }
        }
            System.out.println(pre);
            System.out.println(in);
            System.out.println(pos);
        }

        public static void main (String[]args) throws Exception {
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
            iterativePrePostInTraversal(root);
        }
    }


//50 25 12 37 30 75 62 70 87
//12 25 30 37 50 62 70 75 87
//12 30 37 25 70 62 87 75 50