package BinarySearchTree;

/**
 * Created by Robert-PC on 7/5/2017.
 */
public class TreeDemo {

    public TreeDemo(){

    }

    public void getDemo(){

        TreeManager treeManager = new TreeManager();

        treeManager.insert(treeManager.getRoot(),new TreeNode(3));
        treeManager.insert(treeManager.getRoot(),new TreeNode(1));
        treeManager.insert(treeManager.getRoot(),new TreeNode(2));
        treeManager.insert(treeManager.getRoot(),new TreeNode(4));
        treeManager.insert(treeManager.getRoot(),new TreeNode(5));

        System.out.println("Searching for 1: " + treeManager.search(1));

        System.out.println("Searching for 2: " + treeManager.search(2));
        System.out.println("Searching for 6: " + treeManager.search(5));
        System.out.println("Searching for 7: " + treeManager.search(7));


    }
}
