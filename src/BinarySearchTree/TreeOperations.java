package BinarySearchTree;

import sun.reflect.generics.tree.Tree;

import java.util.Optional;

/**
 * Created by Robert-PC on 7/6/2017.
 */
public class TreeOperations {

    TreeNode root;

    public TreeOperations(TreeNode root){
        this.root = root;
    }

    public TreeOperations(){

    }

    public int getHeight(TreeNode treeNode){
        return 0;
    }

    public Optional<Integer> findMax(){
        TreeNode currentNode = root;
        int max = 0;


        while(currentNode.getLeft() != null){
            currentNode.setLeft(currentNode.getLeft());
        }

        return Optional.ofNullable(currentNode.getData());

    }

    public int findMin(){
        return 0;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
