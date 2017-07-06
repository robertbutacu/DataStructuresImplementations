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

    public Optional<String> findMax(){
        TreeNode currentNode = root;

        if(currentNode == null){
            return Optional.empty();
        }

        while(currentNode.getRight() != null){
            currentNode = currentNode.getRight();
        }

        return Optional.of(Integer.toString(currentNode.getData()));

    }

    public Optional<String> findMin(){
        TreeNode currentNode = root;

        if(currentNode == null){
            return Optional.empty();
        }

        while(currentNode.getLeft() != null)
            currentNode = currentNode.getLeft();

        return Optional.of(Integer.toString(currentNode.getData()));
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
