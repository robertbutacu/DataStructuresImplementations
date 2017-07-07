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
        treeManager.insert(treeManager.getRoot(),new TreeNode(0));

        System.out.println("Searching for 1: " + treeManager.search(1));

        System.out.println("Searching for 2: " + treeManager.search(2));
        System.out.println("Searching for 6: " + treeManager.search(5));
        System.out.println("Searching for 7: " + treeManager.search(7));



        /*
                Current tree :
                                             3
                              1                              4
                      0               2                               5
         */
        TreeOperations treeOperations = new TreeOperations(treeManager.getRoot());
        System.out.println("Max : " + treeOperations.findMax().orElse("Empty tree"));

        System.out.println("Min : " + treeOperations.findMin().orElse("Empty tree"));

        System.out.println("Height : " + treeOperations.getHeight());

        System.out.println("BREADTH FIRST SEARCH");
        treeOperations.breadthFirstSearch();

        System.out.println("Is bst? " + treeOperations.isBinarySearchTree());

        System.out.println("Preorder search: ");
        treeOperations.preorderSearch(treeOperations.getRoot());

        System.out.println("Inorder search : ");
        treeOperations.inorderSearch(treeOperations.getRoot());

        System.out.println("Postorder search: ");
        treeOperations.postOrderSearch(treeOperations.getRoot());
    }
}
