import java.util.ArrayList;

import org.w3c.dom.Node;

public class PrintInRange {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {

        ArrayList<Integer> list = new ArrayList<>();

        if (root == null)
            return list;

        if (root.data >= low && root.data <= high) {
            list.addAll(printNearNodes(root.left, low, high));
            list.add(root.data);
            list.addAll(printNearNodes(root.right, low, high));
        } else if (root.data < low) {
            list.addAll(printNearNodes(root.right, low, high));
        } else {
            list.addAll(printNearNodes(root.left, low, high));
        }
        return list;
    }
        //list.addAll() is used to add the elements from the left and right subtrees to the list after the recursive calls. 
  //This ensures that all elements within the given range are included in the list.


    public static void main(String[] args) {

        System.out.print("\033[2H\033[2J");
        System.out.flush();
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);

        System.out.println(printNearNodes(root, 2, 5));

    }

}
