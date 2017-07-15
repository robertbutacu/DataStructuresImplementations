package Graph;

import BinarySearchTree.BalanceBinaryTree;
import BinarySearchTree.TreeManager;
import BinarySearchTree.TreeNode;
import BinarySearchTree.TreeOperations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

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
    Set<TreeNode> friendsList;

    public User(TreeNode user){
        this.user = user;
        this.friendsList = new HashSet<>();
    }


    public boolean isFriend(TreeNode user){
        return friendsList.contains(user);

    }

    public boolean addFriend(User newFriend){
        return this.friendsList.add(newFriend.getUser());

    }

    public boolean removeFriend(User removedFriend){
        return this.friendsList.remove(removedFriend.getUser());
    }


    public TreeNode getUser() {
        return user;
    }

    public Set<TreeNode> getFriendsList() {
        return friendsList;
    }

    public void printFriends(){
        for(TreeNode u : this.friendsList)
            System.out.println("Current friend : " + u.getUsername());

    }

}
