package Queue;

/**
 * Created by Robert-PC on 7/3/2017.
 */
public class QueueDemo {

    public QueueDemo(){

    }

    public void startDemo(){
        QueueArrayImpl queueArray = new QueueArrayImpl<Integer>(5);

        System.out.println(queueArray.peek().orElse("Empty queue"));

        System.out.println("Inserting : 1,2,3,4,5.");
        queueArray.enqueue(1);

        queueArray.enqueue(2);

        queueArray.enqueue(3);

        queueArray.enqueue(4);

        queueArray.enqueue(5);

        System.out.print("Shouldnt insert: ");

        queueArray.enqueue(6);

        System.out.println("Top should be 1 : " + queueArray.peek().get());

        System.out.println("Dequeue 1:" + queueArray.dequeue().get());
        System.out.println("Dequeue 2:" + queueArray.dequeue().get());
        System.out.println("Dequeue 3:" + queueArray.dequeue().get());

        queueArray.enqueue(6);
        queueArray.enqueue(7);
        queueArray.enqueue(8);
        System.out.print("Queue should be full : ");
        queueArray.enqueue(9);

        System.out.println("Top 4: " + queueArray.peek().get());

        System.out.println("Dequeue 4:" + queueArray.dequeue().get());
        System.out.println("Dequeue 5:" + queueArray.dequeue().get());
        System.out.println("Dequeue 6:" + queueArray.dequeue().orElse("Empty queue"));
        System.out.println("Dequeue 7:" + queueArray.dequeue().orElse("Empty queue"));
        System.out.println("Dequeue 8:" + queueArray.dequeue().orElse("Empty queue"));
        System.out.println("Dequeue empty: " + queueArray.dequeue().orElse("Empty queue"));

    }

}
