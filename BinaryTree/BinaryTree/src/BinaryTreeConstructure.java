import java.util.Stack;

public class BinaryTreeConstructure {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(){

        }
        Node(int data){
            this.data = data;
        }
    }

    public static class Pair{
        Node node;
        int state;

        Pair(){

        }
        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {
        Integer[]arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Stack<Pair> st = new Stack<>();
        Node r = new Node(arr[0]);
        Pair p = new Pair(r,1);
        st.push(p);
        int idx = 1;
        while (st.size() > 0){
            Pair top = st.peek();
            if(top.state == 1){
                top.state++;
               if(arr[idx] != null){
                   top.node.left = new Node(arr[idx]);
                   Pair rcp = new Pair(top.node.left,1);
                   st.push(rcp);
               }
               idx++;
            } else if (top.state == 2) {
                top.state++;
                if(arr[idx] != null){
                    top.node.right = new Node(arr[idx]);
                    Pair lcp = new Pair(top.node.right,1);
                    st.push(lcp);
                }
                idx++;
            }
            else {

                st.pop();
            }
        }
    }

}
