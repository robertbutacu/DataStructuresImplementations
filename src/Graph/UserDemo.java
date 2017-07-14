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

        User robert = new User(first);
        User david = new User(second);
        User ariana = new User(third);
        User kavinsky = new User(fourth);
        User jordan = new User(fifth);
        User trevor = new User(sixth);

        UserManager userManager = new UserManager();

        /*
            Robert : David,Jordan,Ariana.
            David : Robert, Jordan, Trevor.

         */

        System.out.println("1 + 2 :" + userManager.connectUsers(robert,david));
        System.out.println("1 + 3 :" + userManager.connectUsers(robert,ariana));
        System.out.println("1 + 4 :" + userManager.connectUsers(robert,jordan));
        System.out.println("2 + 4 :" + userManager.connectUsers(david,kavinsky));
        System.out.println("2 + 5 :" + userManager.connectUsers(david,jordan));
        System.out.println("2 + 1 :" + userManager.connectUsers(david,robert));

        //new UserPrinter(userManager).printInfoAboutNetwork();

        trevor.printFriends();
        /*System.out.println("Removing connection between first and second user : " + userManager.removeConnection(robert,david));
        System.out.println("1 - 3:" + userManager.removeConnection(robert,ariana));


        System.out.println("Should return false:");
        System.out.println("1 - 2:");
        System.out.println(userManager.removeConnection(robert,david));
        System.out.println("2 - 5:" );
        System.out.println(userManager.removeConnection(david,jordan));

        System.out.println("\n\nUsers list:");*/
        //userManager.printUsersList();

       /* System.out.println("\n\nIs first user friend with second user? (false)");
        System.out.println(robert.isFriend(robert.getUser(), david.getUser().getData()));

        System.out.println("\n\n\n");

        new UserPrinter(userManager).printInfoAboutNetwork();*/

    }
}
