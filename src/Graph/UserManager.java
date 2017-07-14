package Graph;

import java.util.ArrayList;
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

        boolean isFirstUserConnected = firstUser.addFriend(secondUser);
        boolean isSecondUserConnected = secondUser.addFriend(firstUser);

        //in case first user added second user and second user hasn't
        if(isFirstUserConnected && !isSecondUserConnected)
            firstUser.removeFriend(secondUser);

        //opposite of the above case
        if(isFirstUserConnected && !isSecondUserConnected)
            secondUser.removeFriend(firstUser);

        return isFirstUserConnected && isSecondUserConnected;
    }

    public boolean removeConnection(User firstUser, User secondUser){
        boolean hasFirstUserRemoved = firstUser.removeFriend(secondUser);
        boolean hasSecondUserRemoved = secondUser.removeFriend(firstUser);

        //in case first user removed and second user hasn't
        if(hasFirstUserRemoved && !hasSecondUserRemoved)
            firstUser.addFriend(secondUser);


        //opposite case from above
        if(!hasFirstUserRemoved && hasSecondUserRemoved)
            secondUser.addFriend(firstUser);

        return hasFirstUserRemoved && hasSecondUserRemoved;
    }

    public boolean addUser(User user){
        return user == null && this.usersList.add(user);
    }


    public Set<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(Set<User> usersList) {
        this.usersList = usersList;
    }
}
