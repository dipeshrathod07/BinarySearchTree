import java.util.ArrayList;

public class RootToLeafPath 
{
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static void printdata(ArrayList<Integer> path)
    {
        for(int i = 0 ; i < path.size();i++)
        {
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static void printpath(Node root, ArrayList<Integer> list)
    {
        if(root == null)return;

        list.add(root.data);

        if(root.left == null && root.right== null)
        {
            printdata(list);
        }
        printpath(root.left, list);
        printpath(root.right, list);
        list.remove(list.size()-1);

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
