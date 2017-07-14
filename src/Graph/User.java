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
        if(user == null)
            return false;

        if(user.getData() == data)
            return true;

        if(user.getData() < data)
            return isFriend(user.getRight(), data);
        else
            return isFriend(user.getLeft(), data);

    }

    public boolean addFriend(User newFriend){
        if(newFriend == null)
            return false;

        if(this.isFriend(this.getUser(), newFriend.getUser().getData()))
            return false;

        if(newFriend.getUser() == this.user)
            return false;

        this.friendsList.insert(this.user, newFriend.getUser());
        this.friendsList.setRoot(new BalanceBinaryTree().transformToAVL(this.friendsList.getRoot()));

        return true;
    }

    public boolean removeFriend(User removedFriend){
        if(removedFriend == null)
            return false;

        if(this == removedFriend)
            return false;

        if(this.isFriend(this.getUser(), removedFriend.getUser().getData()))
            return false;

        this.getFriendsList().delete(this.getUser(), removedFriend.getUser().getData());

        return true;
    }


    public TreeNode getUser() {
        return user;
    }

    public TreeManager getFriendsList() {
        return friendsList;
    }

    public void printFriends(){
        new TreeOperations(this.friendsList.getRoot()).breadthFirstSearch();
    }

}
