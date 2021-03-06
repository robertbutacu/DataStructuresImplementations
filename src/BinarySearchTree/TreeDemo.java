package BinarySearchTree;

/**
 * Created by Robert-PC on 7/5/2017.
 */
public class TreeDemo {

    public TreeDemo() {

    }

    public void getDemo() {

        TreeManager treeManager = new TreeManager();

        treeManager.insert(treeManager.getRoot(), new TreeNode(3, "A"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(1, "B"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(2, "C"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(4, "D"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(5, "E"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(0, "F"));

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

        System.out.println("Root after deletion");

        treeManager.delete(treeManager.getRoot(), 3);

        System.out.println(treeManager.getRoot().getData());
        treeManager.delete(treeManager.getRoot(), 4);
        treeManager.delete(treeManager.getRoot(), 0);
        treeManager.delete(treeManager.getRoot(), 5);
        treeManager.delete(treeManager.getRoot(), 5);
        treeManager.delete(treeManager.getRoot(), 10);
        treeManager.delete(treeManager.getRoot(), 2);
        treeManager.delete(treeManager.getRoot(), 5);
        treeManager.delete(treeManager.getRoot(), 1);
        treeManager.delete(treeManager.getRoot(), 3);

        treeOperations.setRoot(treeManager.getRoot());
        System.out.println("After deletion");
        System.out.println(new TreeManager(treeManager.getRoot()).isEmpty());
        treeOperations.breadthFirstSearch();

        System.out.println(treeOperations.isBalanced(treeOperations.getRoot()));

        System.out.println("Before : ");
        treeManager.setRoot(new TreeNode(1, "F"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(2, "A"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(3, "B"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(4, "C"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(5, "D"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(6, "E"));
        treeManager.insert(treeManager.getRoot(), new TreeNode(7, "F"));


        treeOperations.setRoot(treeManager.getRoot());
        treeOperations.breadthFirstSearch();
        System.out.println("Is balanced? " + treeOperations.isBalanced(treeOperations.getRoot()));

        System.out.println("After :");
        TreeNode root = new BalanceBinaryTree().transformToAVL(treeManager.getRoot());
        treeOperations.setRoot(root);

        treeOperations.breadthFirstSearch();
        System.out.println("Is balanced? " + treeOperations.isBalanced(treeOperations.getRoot()));
        System.out.println("Height :" + treeOperations.getHeight());
    }
}
