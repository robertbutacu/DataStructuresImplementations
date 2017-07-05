package BinarySearchTree;

/**
 * Created by Robert-PC on 7/5/2017.
 */
public class TreeDemo {

    public TreeDemo(){

    }

    public void getDemo(){

        TreeManager treeManager = new TreeManager();

        treeManager.insert(treeManager.getRoot(),1);
        treeManager.insert(treeManager.getRoot(),2);
        treeManager.insert(treeManager.getRoot(),3);
        treeManager.insert(treeManager.getRoot(),4);
        treeManager.insert(treeManager.getRoot(),5);

        System.out.println(treeManager.search(1));

        System.out.println(treeManager.search(2));
        System.out.println(treeManager.search(6));
        System.out.println(treeManager.search(7));


    }
}
