public class searchANode
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

    public static boolean searchKey(Node root,int key)
    {
        
        while(root != null && root.data != key)
        {
            
           root = root.data > key?root.left:root.right;
           
        }
        
           if(root == null)return false;
        
            return true;
        
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

        boolean x = searchKey(root, 0);
        System.out.println(x);
    }
    
}
