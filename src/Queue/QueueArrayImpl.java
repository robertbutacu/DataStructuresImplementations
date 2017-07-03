package Queue;

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

    public T dequeue(){

    }

    public void enqueue(){

    }

    public T peek(){

    }
}
