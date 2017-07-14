package Graph;

import BinarySearchTree.BalanceBinaryTree;
import BinarySearchTree.TreeManager;
import BinarySearchTree.TreeNode;
import BinarySearchTree.TreeOperations;

import java.util.Optional;

/**
 * Created by Robert-PC on 7/13/2017.
 */
public class User {


    /*
        IMPORTANT!!!

            Having implemented Graph data structure AFTER implementing BST, I didn't know i was gonna implement the Graph as a
        network of users. Saying that, the ordering in the BST doesn't make much sense, as nodes are stored by their data
        (which doesn't mean much in the context of a user), and not by their username(as it would make much more sense).

            You are free to make any necessary changes.

            TODO change ordering in BST to be by username, and not by data.

     */

    //current user
    TreeNode user;

    //binary tree representing the network of friends
    TreeManager friendsList;

    public User(TreeNode user){
        this.user = user;
        this.friendsList = new TreeManager();
    }


    public boolean isFriend(TreeNode user, int data){
        if(user == null){
            //System.out.println("Is friend : Null user.");
            return false;
        }

        if(user.getData() == data)
            return true;

        if(user.getData() < data)
            return isFriend(user.getRight(), data);
        else
            return isFriend(user.getLeft(), data);

    }

    public boolean addFriend(User newFriend){
        if(newFriend == null){
            //System.out.println("Adding : Null new friend.");
            return false;

        }

        if(this.isFriend(this.friendsList.getRoot(), newFriend.getUser().getData())){
            //System.out.println("Adding : Already friends.");
            return false;

        }
        if(newFriend.getUser() == this.user){
            //System.out.println("Adding : Can't befriend yourself.");
            return false;

        }

        //System.out.println("Inserting " + newFriend.getUser().getUsername() + " " + this.getUser().getUsername());
        this.friendsList.insert(this.friendsList.getRoot(), newFriend.getUser());
        //this.friendsList.setRoot(new BalanceBinaryTree().transformToAVL(this.friendsList.getRoot()));

        return true;
    }

    public boolean removeFriend(User removedFriend){
        if(removedFriend == null){
            //System.out.println("Removing : null friend");
            return false;

        }

        if(this == removedFriend){
            //System.out.println("Removing : can't remove yourself");
            return false;

        }

        if(!this.isFriend(this.getFriendsList().getRoot(), removedFriend.getUser().getData())){
            System.out.println("Removing : they are not friends.");
            return false;

        }

        this.getFriendsList().delete(this.getFriendsList().getRoot(), removedFriend.getUser().getData());

        return true;
    }


    public TreeNode getUser() {
        return user;
    }

    public TreeManager getFriendsList() {
        return friendsList;
    }

    public void printFriends(){
        if(this.friendsList.getRoot() == null)
            System.out.println(this.getUser().getUsername() + " has no friends.");
        TreeOperations t = new TreeOperations(this.friendsList.getRoot());
        t.breadthFirstSearch();
    }

}
