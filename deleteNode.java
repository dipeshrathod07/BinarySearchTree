public class deleteNode 
{
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

    public static Node deleteAnode(Node root,int val)
    {
        if(root == null)return null;

        if(root.data > val)
        {
           root.left =  deleteAnode(root.left, val);
        }
        else if(root.data < val)
        {
           root.right = deleteAnode(root.right, val);
        }
        else
        {
            if(root.left == null && root.right == null)return null;

            if(root.right == null)
            {
                return root.left;
            }
            else if(root.left == null)
            {
                return root.right;
            }

            Node sol = InorderSuccesor(root.right);
            root.data = sol.data;
            root.right = deleteAnode(root.right, sol.data);
        }
        return root;
    }
    private static Node InorderSuccesor(Node root)
     
    {
        while (root.left != null) {

            root = root.left;
            
        }
        return root;
    }

    public static void InOrder(Node root)
    {
        if(root == null)return;

        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);

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

        deleteAnode(root, 5);

        InOrder(root);



    }

    
}
