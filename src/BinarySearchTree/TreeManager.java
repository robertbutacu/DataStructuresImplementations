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


    public TreeNode getRoot() {
        return root;
    }

    public TreeNode insert(TreeNode treeNode, int data){
        if(treeNode == null){
            // inserting new node
            treeNode =  new TreeNode(data);
            System.out.println(treeNode.getData());
            return treeNode;
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

    public boolean search(int data){
        return searchData(root, data);
    }

    private boolean searchData(TreeNode treeNode, int data){
        if(treeNode == null)
            return false;

        if(treeNode.getData() == data){
            System.out.println("Found");
            return true;

        }

        System.out.println("Current node data : " + treeNode.getData());
        if(treeNode.getData() > data)
            searchData(treeNode.getLeft(), data);
        else
            searchData(treeNode.getRight(),data);

        return true;
    }


}
