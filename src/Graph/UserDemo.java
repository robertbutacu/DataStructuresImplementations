package Graph;

import BinarySearchTree.TreeNode;

/**
 * Created by Robert-PC on 7/14/2017.
 */
public class UserDemo {

    public UserDemo(){

    }

    public void getDemo(){
        TreeNode first = new TreeNode(1,"Robert");
        TreeNode second = new TreeNode(2,"David");
        TreeNode third = new TreeNode(3, "Ariana");
        TreeNode fourth = new TreeNode(4,"Kavinsky");
        TreeNode fifth = new TreeNode(6,"Jordan");
        TreeNode sixth = new TreeNode(5,"Trevor");

        User firstUser = new User(first);
        User secondUser = new User(second);
        User thirdUser = new User(third);
        User fourthUser = new User(fourth);
        User fifthUser = new User(fifth);
        User sixthUser = new User(sixth);

        UserManager userManager = new UserManager();

        userManager.connectUsers(firstUser,secondUser);
        userManager.connectUsers(firstUser,thirdUser);
        userManager.connectUsers(firstUser,fifthUser);
        userManager.connectUsers(secondUser,fourthUser);
        userManager.connectUsers(secondUser,fifthUser);
        userManager.connectUsers(secondUser,firstUser);

        new UserPrinter(userManager).printInfoAboutNetwork();

        userManager.removeConnection(firstUser,secondUser);
        userManager.removeConnection(firstUser,thirdUser);
        System.out.println("Should return false:");
        userManager.removeConnection(firstUser,secondUser);
        userManager.removeConnection(secondUser,fifthUser);

        System.out.println("\n\n\n");

        new UserPrinter(userManager).printInfoAboutNetwork();

    }
}
