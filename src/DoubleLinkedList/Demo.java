package DoubleLinkedList;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Robert-PC on 7/2/2017.
 */
public class Demo {


    public void getDemo(){
        DoubleLinkedListManager linkedListManager;

        DoubleLinkedList firstHouse = new DoubleLinkedList("Random Street",3,12300);
        DoubleLinkedList secondHouse = new DoubleLinkedList("Random Street", 4, 12310);

        DoubleLinkedList thirdHouse = new DoubleLinkedList("Random Street", 6, 123123);
        DoubleLinkedList fourthHouse = new DoubleLinkedList("Random Street", 1, 1231);
        DoubleLinkedList fifthHouse = new DoubleLinkedList("Random Street", 12, 1111);

        linkedListManager = new DoubleLinkedListManager(firstHouse);
        linkedListManager.add(secondHouse);
        linkedListManager.add(thirdHouse);
        linkedListManager.add(fourthHouse);
        linkedListManager.add(fifthHouse);

        System.out.println("First");
        linkedListManager.printInfo();

        DoubleLinkedList randomHouse = new DoubleLinkedList("Really Random", 2, 12312);
        linkedListManager.insertHouseAfterPosition(3,randomHouse);

        System.out.println("Second");
        linkedListManager.printInfo();

        System.out.println("Third");
        linkedListManager.deleteHouseById(4);
        linkedListManager.printInfo();
    }

    public Demo(){

    }
}
