package DoubleLinkedList;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Robert-PC on 7/2/2017.
 */
public class Demo {
    private void printInfo(DoubleLinkedList iterator){
        while(iterator != null){
            System.out.println("House ID " +
                    iterator.getID() +
                    ". Street Name " +
                    iterator.getStreetName() +
                    ". Wealth :" +
                    iterator.getWealth());
            if(iterator.getNext() != null)
                System.out.println("Front neighbour ID : " + iterator.getNext().getID());
            else
                System.out.println("No front neighbour.");

            if(iterator.getPrevious() != null)
                System.out.println("Back neighbour ID : " + iterator.getPrevious().getID());
            else
                System.out.println("No back neighbour.");

            System.out.println("\n\n\n");
            iterator = iterator.getNext();
        }

    }

    private void replaceOnFoundPosition( DoubleLinkedList toBeInserted, DoubleLinkedList currentNode){
        currentNode.getPrevious().setNext(toBeInserted);
        toBeInserted.setPrevious(currentNode.getPrevious());

        currentNode.setPrevious(toBeInserted);
        toBeInserted.setNext(currentNode);
    }

    private boolean replaceHead(DoubleLinkedList toBeInserted, DoubleLinkedList head){
        toBeInserted.setNext(head);
        toBeInserted.setPrevious(null);

        head.setPrevious(toBeInserted);
        head = toBeInserted;

        printInfo(head);

        return true;
    }

    private void replaceTail(DoubleLinkedList toBeInserted, DoubleLinkedList tail){
        tail.setNext(toBeInserted);
        toBeInserted.setPrevious(tail);
        toBeInserted.setNext(null);
    }


    private boolean insertHouseAfterPosition(int position, DoubleLinkedList toBeInserted, DoubleLinkedList head){
        if(position < 0)
            return false;

        //replacing head
        if(position == 0){
            return replaceHead(toBeInserted, head);
        }

        DoubleLinkedList iterator = head;
        int currentPosition = 0;

        while(iterator != null){
            //found position
            if(currentPosition == position)
                replaceOnFoundPosition(toBeInserted, iterator);

            //position outside of linked list's range
            if((currentPosition + 1) < position && iterator.getNext() == null)
                replaceTail(toBeInserted, iterator);

            iterator = iterator.getNext();
            currentPosition += 1;
        }

        printInfo(head);
        return true;

    }

    private void deleteHouseById(int id, DoubleLinkedList head){
        DoubleLinkedList iterator = head;

        while(iterator != null){
            if(iterator.getID() == id){
                //checking whether its not the last node
                if(iterator.getNext() != null)
                    iterator.getNext().setPrevious(iterator.getPrevious());

                if(iterator.getPrevious() != null)
                    iterator.getPrevious().setNext(iterator.getNext());
                //its the head :/ the king has died, long live the king.
                else
                    head = iterator.getNext();
                System.out.println("House deleted.");

            }

            iterator = iterator.getNext();
        }

        printInfo(head);
    }

    public void getDemo(){
        DoubleLinkedList head = new DoubleLinkedList("Random Street", 4, 12000);

        DoubleLinkedList firstHouse = new DoubleLinkedList("Random Street",3,12300,head);

        head.setNext(firstHouse);
        DoubleLinkedList secondHouse = new DoubleLinkedList("Random Street", 4, 12310, firstHouse);

        DoubleLinkedList thirdHouse = new DoubleLinkedList("Random Street", 6, 123123);
        DoubleLinkedList fourthHouse = new DoubleLinkedList("Random Street", 1, 1231);
        DoubleLinkedList fifthHouse = new DoubleLinkedList("Random Street", 12, 1111);

        //setting relations
        firstHouse.setNext(secondHouse);
        secondHouse.setNext(thirdHouse);
        secondHouse.setPrevious(firstHouse);

        thirdHouse.setNext(fourthHouse);
        thirdHouse.setPrevious(secondHouse);

        fourthHouse.setNext(fifthHouse);
        fourthHouse.setPrevious(thirdHouse);


        fifthHouse.setPrevious(fourthHouse);

        //printing solutions so far
        System.out.println("Printing info before insertion.");
        //printInfo(head);


        //priting after insertion
        DoubleLinkedList secondAndAHalfHouse = new DoubleLinkedList("Cartierul Nou", 1,12312,secondHouse, thirdHouse);

        System.out.println("\n\nPrinting info after insertion.\n\n");
        //printInfo(head);


        //printing after deletion
        System.out.println("Deleting random node");
        //deleteHouseById(6,head);

        System.out.println("Deleting first node");
        //deleteHouseById(0,head);
        System.out.println("Deleting last node");
        //deleteHouseById(5,head);

        DoubleLinkedList randomHouse = new DoubleLinkedList("Really Random", 5, 111222);
        //System.out.println(insertHouseAfterPosition(0, randomHouse, head));
        //System.out.println(insertHouseAfterPosition(3, randomHouse, head));
        //System.out.println(insertHouseAfterPosition(8, randomHouse, head));

    }

    public Demo(){

    }
}
