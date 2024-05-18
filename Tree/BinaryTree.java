package Tree;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class BinaryTree {
    Node root;
    public void insert(int data) {
        root = insertRec(root, data);
    }
    public void inorder(){
        inorderRec(root);
    }
    public void preorder(){
        preorderRec(root);
    }

    public void postorder(){
        postorderRec(root);
    }

    public Node insertRec(Node root, int data){
        if(root == null) root = new Node(data);
        else if (root.data < data) root.right = insertRec(root.right, data);
        else root.left = insertRec(root.left, data);
        return root;
    }
    private void inorderRec(Node root) {
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    private void preorderRec(Node root) {
        if(root != null){
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    private void postorderRec(Node root) {
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
