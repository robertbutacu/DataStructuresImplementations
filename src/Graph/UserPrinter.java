package Graph;

import BinarySearchTree.TreeOperations;

/**
 * Created by Robert-PC on 7/14/2017.
 */
public class UserPrinter {
    private UserManager userManager;

    public UserPrinter(UserManager userManager){
        this.userManager = userManager;
    }

    public void printInfoAboutNetwork(){
        System.out.println("Starting to print info.");
        for(User u : userManager.getUsersList()){
            printInfoAboutUser(u);
        }
    }

    private void printInfoAboutUser(User u){
        System.out.println("User id :" + u.getUser().getId() + " Username : " + u.getUser().getUsername());
        System.out.println("Friends list :");

        new TreeOperations(u.getFriendsList().getRoot()).breadthFirstSearch();

        System.out.println("\n\n");
    }


}
