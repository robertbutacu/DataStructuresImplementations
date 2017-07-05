package BinarySearchTree;

/**
 * Created by Robert-PC on 7/5/2017.
 */
public class TreeNode {
    private int data;

    private TreeNode right;

    private TreeNode left;



    public TreeNode(int data){
        this.data = data;
    }


    public int getData() {
        return data;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }
}
