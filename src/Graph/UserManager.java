package Graph;

import java.util.HashSet;
import java.util.Set;

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

        return firstUser.getFriendsList().add(secondUser.getUser()) &&
                secondUser.getFriendsList().add(firstUser.getUser());
    }

    public boolean removeConnection(User firstUser, User secondUser){
        return firstUser.getFriendsList().remove(secondUser.getUser()) &&
                secondUser.getFriendsList().remove(firstUser.getUser());
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
        if(usersList.isEmpty())
            System.out.println("There are no people currently in the network.");

        for(User u : usersList){
            System.out.println("Username :" + u.getUser().getUsername());
        }
    }

    public void printFriendsOfUser(User user){
        user.printFriends();
    }
}
