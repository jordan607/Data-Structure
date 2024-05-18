package Tree;
//https://www.geeksforgeeks.org/postorder-traversal-of-binary-tree/?ref=ml_lbp
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
//        tree.insert(8);
//        tree.insert(7);
//        tree.insert(12);
//        tree.insert(15);
//        tree.insert(2);
//        tree.insert(5);
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        tree.inorder();
        System.out.println();
        tree.preorder();
        System.out.println();
        tree.postorder();
    }
}
