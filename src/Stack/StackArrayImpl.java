package Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robert-PC on 7/2/2017.
 */
public class StackArrayImpl<T> {

    /*
        StackArrayImpl =>
            - first in - last out
            - pop - removes top element
            - push - pushed element to top
            - top - returns top element

            Current position starts at -1 and gets incremented first thing when pushing -> done that so that currentPosition matches
                top element precisely.

            Generic class so it accepts stacks of integers, words, chars, etc etc.

     */
    private int currentPosition = -1;

    private int stackSize;

    private T[] stack;


    public StackArrayImpl( int size){
        stack = (T[]) new Object[size];
        this.stackSize = size;
    }


    public T push(T element){
        if((currentPosition + 1) == stackSize){
            return this.top();
        }
        currentPosition += 1;
        stack[currentPosition] = element;
        return stack[currentPosition];

    }


    public T pop(){
        if(currentPosition == -1 ){
            return null;
        }

        currentPosition -= 1;
        return stack[currentPosition+1];
    }

    public T top(){
        if(currentPosition == -1){
            return null;
        }
        return stack[currentPosition];
    }
}
