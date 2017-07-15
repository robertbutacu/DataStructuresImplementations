package Graph;

import BinarySearchTree.TreeNode;

/**
 * Created by Robert-PC on 7/14/2017.
 */
public class UserDemo {

    public UserDemo(){

    }

    public void getDemo(){
        User a = new User(new TreeNode(1, "a"));
        User b = new User(new TreeNode(2, "b"));
        User c = new User(new TreeNode(3, "c"));
        User d = new User(new TreeNode(4, "d"));
        User e = new User(new TreeNode(5, "e"));

        UserManager manager = new UserManager();

        System.out.println(manager.connectUsers(a, b));
        System.out.println(manager.connectUsers(a, b));
        System.out.println(manager.connectUsers(a, e));
        System.out.println(manager.connectUsers(b, c));
        System.out.println(manager.connectUsers(a, d));
        System.out.println(manager.connectUsers(a, d));
        System.out.println(manager.connectUsers(b, e));
        new UserPrinter(manager).printInfoAboutNetwork();

        System.out.println(manager.removeConnection(a,b));
        System.out.println(manager.removeConnection(a,b));
        System.out.println(manager.removeConnection(a,e));
        System.out.println(manager.removeConnection(a,c));
        System.out.println(manager.removeConnection(b,e));

        new UserPrinter(manager).printInfoAboutNetwork();
    }
}
