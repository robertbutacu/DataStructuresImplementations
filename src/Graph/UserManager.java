package Graph;

import java.util.ArrayList;

/**
 * Created by Robert-PC on 7/14/2017.
 */
public class UserManager {
    private ArrayList<User> usersList;

    public UserManager(ArrayList<User> usersList){
        this.usersList = usersList;
    }

    public UserManager(){
        this.usersList = new ArrayList<>();
    }

    public boolean connectUsers(User firstUser, User secondUser){
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

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }
}
