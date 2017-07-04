package Queue;

import java.util.Optional;

/**
 * Created by Robert-PC on 7/3/2017.
 */
public class QueueArrayImpl<T> {

    private T[] queue;

    private int queueSize;

    private int front = -1;

    private int rear = -1;

    public QueueArrayImpl(int size){
        queue = (T[]) new Object[size];
        this.queueSize = size;

    }

    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }

    public Optional<T> dequeue(){
        if(isEmpty() ){
            return Optional.empty();
        }

        if(front == rear){
            T result = queue[front];
            front = -1; rear = -1;
            return Optional.ofNullable(result);

        }

        T copy = queue[front];
        front = (front + 1) % queueSize;
        return Optional.ofNullable(copy);

    }

    public void enqueue(T element){
        if(front == -1 && rear == -1){
            front = 0; rear = 0;
            queue[front] = element;
            return;
        }

        if((rear + 1) % queueSize == front){
            System.out.println("Queue full. Come back later.");
            return;
        }
        rear = (rear + 1) % queueSize;
        queue[rear] = element;

    }

    public Optional<T> peek(){
        try{
            return Optional.ofNullable(queue[front]);
        }catch(ArrayIndexOutOfBoundsException e){
            return Optional.empty();
        }
    }
}
