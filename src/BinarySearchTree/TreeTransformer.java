package BinarySearchTree;

import sun.reflect.generics.tree.Tree;

import java.util.Vector;

/**
 * Created by Robert-PC on 7/13/2017.
 */
public class TreeTransformer {

    public TreeTransformer(){
    }

    public TreeNode transformToAVL(TreeNode root){
        Vector<TreeNode> storage = new Vector<TreeNode>();
        storeNodes(root, storage);
        return buildAVLTree(storage, 0, storage.size() - 1);
    }

    private void storeNodes(TreeNode current, Vector<TreeNode> storage){
        if(current == null)
            return;

        storeNodes(current.getLeft(), storage);
        storage.add(current);
        storeNodes(current.getRight(), storage);
    }

    private TreeNode buildAVLTree(Vector<TreeNode> storage, int start, int end){
        if(start > end)
            return null;

        int mid = (start + end)/2 ;

        TreeNode current = storage.get(mid);

        current.setLeft(buildAVLTree(storage, start , mid-1));
        current.setRight(buildAVLTree(storage, mid + 1 , end));

        return current;
    }
}
