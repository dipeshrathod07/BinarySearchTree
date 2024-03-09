import java.util.ArrayList;

public class ValidBst {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static boolean helper(Node root,Node min,Node max)
    {
        if(root == null)return true;

        if(min != null && root.data <= min.data)return false;


        if(max != null && root.data >= max.data)return false;

        return helper(root.left, min, root)&&helper(root.right, root, max);
    }

    public static boolean isValidBST(Node root)
    {
        if(!helper(root, null, null))return false;
        else return true;
    }

      public static void main(String[] args) {

        System.out.print("\033[2H\033[2J");
        System.out.flush();
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);

       printpath(root, new ArrayList<>());

    }
    
}
