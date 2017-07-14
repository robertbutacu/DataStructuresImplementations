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

        /*
            Robert : David,Jordan,Ariana.
            David : Robert, Jordan, Trevor.

         */

        System.out.println("1 + 2 :" + userManager.connectUsers(firstUser,secondUser));
        System.out.println("1 + 3 :" + userManager.connectUsers(firstUser,thirdUser));
        System.out.println("1 + 4 :" + userManager.connectUsers(firstUser,fifthUser));
        System.out.println("2 + 4 :" + userManager.connectUsers(secondUser,fourthUser));
        System.out.println("2 + 5 :" + userManager.connectUsers(secondUser,fifthUser));
        System.out.println("2 + 1 :" + userManager.connectUsers(secondUser,firstUser));

        //new UserPrinter(userManager).printInfoAboutNetwork();

        System.out.println("Removing connection between first and second user : " + userManager.removeConnection(firstUser,secondUser));
        System.out.println("1 - 3:" + userManager.removeConnection(firstUser,thirdUser));
        System.out.println("Should return false:");
        System.out.println("1 - 2:");
        System.out.println(userManager.removeConnection(firstUser,secondUser));
        System.out.println("2 - 5:" );
        System.out.println(userManager.removeConnection(secondUser,fifthUser));

        System.out.println("\n\nUsers list:");
        userManager.printUsersList();

        System.out.println("\n\nIs first user friend with second user? (false)");
        System.out.println(firstUser.isFriend(firstUser.getUser(), secondUser.getUser().getData()));

        System.out.println("\n\n\n");

        new UserPrinter(userManager).printInfoAboutNetwork();

    }
}
