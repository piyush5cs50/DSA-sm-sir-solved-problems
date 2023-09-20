public class BinaryTreeIntoduction {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data,Node left,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        Node n = new Node(10, null, null);

        System.out.println(n.data );

    }
}