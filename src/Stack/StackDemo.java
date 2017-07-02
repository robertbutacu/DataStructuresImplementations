package Stack;

/**
 * Created by Robert-PC on 7/2/2017.
 */

//TODO stack impl using linked lists.
public class StackDemo {
    private StackArrayImpl stackArrayImplDemo;

    public StackDemo(int size){
        stackArrayImplDemo = new StackArrayImpl(size);

        System.out.println("Push : " + stackArrayImplDemo.push(1));
        System.out.println("Push : " + stackArrayImplDemo.push(2));
        System.out.println("Push : " + stackArrayImplDemo.push(3));

        System.out.println("Popping : " + stackArrayImplDemo.pop());
        System.out.println("Top : " + stackArrayImplDemo.top());
        System.out.println("Pushing : " + stackArrayImplDemo.push(123));
        System.out.println("Pushing(should refuse) : " + stackArrayImplDemo.push(12312));
        System.out.println("Top : " + stackArrayImplDemo.top());
    }

}
