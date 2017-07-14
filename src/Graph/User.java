package Graph;

import BinarySearchTree.BalanceBinaryTree;
import BinarySearchTree.TreeManager;
import BinarySearchTree.TreeNode;

import java.util.Optional;

/**
 * Created by Robert-PC on 7/13/2017.
 */
public class User {

    //current user
    TreeNode user;

    //binary tree representing the network of friends
    TreeManager friendsList;

    public User(TreeNode user){
        this.user = user;
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

        this.friendsList.setRoot(new BalanceBinaryTree().transformToAVL(this.friendsList.insert(this.user, newFriend.getUser())));

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

}
