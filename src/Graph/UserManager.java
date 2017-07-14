package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Robert-PC on 7/14/2017.
 */
public class UserManager {
    private Set<User> usersList;

    public UserManager(Set<User> usersList){
        this.usersList = usersList;
    }

    public UserManager(){
        this.usersList = new HashSet<>();
    }

    public boolean connectUsers(User firstUser, User secondUser){
        this.addUser(firstUser);
        this.addUser(secondUser);

        if(firstUser.isFriend(firstUser.getFriendsList().getRoot(), secondUser.getUser().getData()))
            return false;

        return firstUser.addFriend(secondUser) && secondUser.addFriend(firstUser);
    }

    public boolean removeConnection(User firstUser, User secondUser){
        if(!firstUser.isFriend(firstUser.getFriendsList().getRoot(), secondUser.getUser().getData()))
            return false;

        return firstUser.removeFriend(secondUser) && secondUser.removeFriend(firstUser);
    }

    public boolean addUser(User user){
        return this.usersList.add(user);
    }


    public Set<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(Set<User> usersList) {
        this.usersList = usersList;
    }

    public void printUsersList(){
        for(User u : usersList){
            System.out.println("Username :" + u.getUser().getUsername());
        }
    }

    public void printFriendsOfUser(User user){
        user.printFriends();
    }
}
