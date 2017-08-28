package BinarySearchTree;

import java.util.Vector;

/**
 * Created by Robert-PC on 7/13/2017.
 */
public class BalanceBinaryTree {

    public BalanceBinaryTree() {
    }

    public TreeNode transformToAVL(TreeNode root) {
        Vector<TreeNode> storage = new Vector<TreeNode>();
        storeNodes(root, storage);
        return buildBalancedTree(storage, 0, storage.size() - 1);
    }

    private void storeNodes(TreeNode current, Vector<TreeNode> storage) {
        if (current == null)
            return;

        storeNodes(current.getLeft(), storage);
        storage.add(current);
        storeNodes(current.getRight(), storage);
    }

    private TreeNode buildBalancedTree(Vector<TreeNode> storage, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;

        TreeNode current = storage.get(mid);

        current.setLeft(buildBalancedTree(storage, start, mid - 1));
        current.setRight(buildBalancedTree(storage, mid + 1, end));

        return current;
    }
}
