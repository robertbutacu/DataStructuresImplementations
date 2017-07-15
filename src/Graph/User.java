package Graph;
import BinarySearchTree.TreeNode;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Robert-PC on 7/13/2017.
 */
public class User {
    //current user
    TreeNode user;

    //binary tree representing the network of friends
    Set<TreeNode> friendsList;

    public User(TreeNode user){
        this.user = user;
        this.friendsList = new TreeSet<>();
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
