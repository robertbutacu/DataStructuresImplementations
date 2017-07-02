package Stack;

/**
 * Created by Robert-PC on 7/2/2017.
 */
public class StackArrayImpl {

    /*
        StackArrayImpl =>
            - first in - last out
            - pop - removes top element
            - push - pushed element to top
            - top - returns top element

            Current position starts at -1 and gets incremented first thing when pushing -> done that so that currentPosition matches
                top element precisely.

     */
    private int currentPosition = -1;

    private int stackSize;

    private int[] stack;


    public StackArrayImpl(int size){
        stack = new int[size];
        this.stackSize = size;
    }


    public String push(int element){
        if((currentPosition + 1) == stackSize){
            return "Stack is full! Please pop to create space. Top element : " + this.top() ;
        }
        currentPosition += 1;
        stack[currentPosition] = element;
        return Integer.toString(element);

    }


    public String pop(){
        if(currentPosition == -1 ){
            return "Stack is empty";
        }

        currentPosition -= 1;
        return Integer.toString(stack[currentPosition + 1]);
    }

    public String top(){
        if(currentPosition == -1){
            return "StackArrayImpl is empty";
        }
        return Integer.toString(stack[currentPosition]);
    }
}
