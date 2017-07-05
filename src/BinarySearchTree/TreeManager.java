package BinarySearchTree;

import sun.reflect.generics.tree.Tree;

import java.util.Optional;

/**
 * Created by Robert-PC on 7/5/2017.
 */
public class TreeManager {

    TreeNode root;

    public TreeManager(){

    }

    public TreeManager(TreeNode root){
        this.root = root;
    }


    public TreeNode insert(TreeNode treeNode, int data){
        if(treeNode == null){
            // inserting new node
            return new TreeNode(data);
        }

        if(data <= treeNode.getData()){
            //searching in left side of the tree
            treeNode.setLeft(insert(treeNode.getLeft(),data));
        }
        else{
            treeNode.setRight(insert(treeNode.getRight(),data));
        }

        return treeNode;

    }
}
