public class buildTree {

    static class Node
    {
        int data;
        Node left , right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //Here we Insert the node at appropriate place//

    public static Node insert(Node root , int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }
        if(root.data > val)
        {
           root.left = insert(root.left, val); 
        }
        if(root.data < val)
        {
            root.right = insert(root.right, val);
        }

        return root;
    }

    //Here basically to get sorted tree we use inOrder traversal//

    public static void InOrder(Node root)
    {
        if(root == null)return;

        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);

    }
    public static void main(String[] args) 
    {
        // Node root = new Node(4);
        // root.left = new Node(2);
        // root.right = new Node(5);
        // root.left.left = new Node(1);
        // root.left.right = new Node(3);
        // root.right.right = new Node(6);

        int val[] ={5,1,3,4,2,6};

        Node root = null;

        for(int i = 0 ; i < val.length;i++)
        {
            root=insert(root, val[i]);

        }

        InOrder(root);
        
        //if you are getting in sorted order [1,2,3,4,5,6] then it is true//
    }
}