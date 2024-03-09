import java.util.ArrayList;


public class convertIntoMirror 
{
    //basically this question is also helpful for binary tree also

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node invertTree(Node root) {
        if(root == null)return null;

        Node left = invertTree(root.left);
        Node right = invertTree(root.right);

        root.right = left;
        root.left = right;

        return root;
    }

    public static void preorder(Node root)
    {
        if(root==null)return ;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
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



       root = invertTree(root);

       preorder(root);//Here we get output printed as mirror tree//

    }



    
}
