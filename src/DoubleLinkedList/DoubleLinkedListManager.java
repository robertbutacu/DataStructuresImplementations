package DoubleLinkedList;

/**
 * Created by Robert-PC on 7/2/2017.
 */
public class DoubleLinkedListManager {
    private DoubleLinkedList head;
    private DoubleLinkedList tail;

    public DoubleLinkedListManager(DoubleLinkedList head){
        this.head = head;
        this.tail = head;
    }

    public void printInfo(){
        DoubleLinkedList iterator = head;

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

    public boolean insertHouseAfterPosition(int position, DoubleLinkedList toBeInserted){
        if(position < 0)
            return false;

        //replacing head
        if(position == 0){
            return replaceHead(toBeInserted);
        }

        DoubleLinkedList iterator = this.head;
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

        return true;

    }

    public void add(DoubleLinkedList newItem){
        newItem.setPrevious(tail);
        newItem.setNext(null);
        tail.setNext(newItem);

        tail = newItem;
    }

    public void deleteHouseById(int id){
        DoubleLinkedList iterator = this.head;

        while(iterator != null){
            if(iterator.getID() == id){
                //checking whether its not the last node
                if(iterator.getNext() != null)
                    iterator.getNext().setPrevious(iterator.getPrevious());

                if(iterator.getPrevious() != null)
                    iterator.getPrevious().setNext(iterator.getNext());
                    //its the head :/ the king has died, long live the king.
                else
                    this.head = iterator.getNext();
                System.out.println("House deleted.");

            }

            iterator = iterator.getNext();
        }

    }

    private void replaceTail(DoubleLinkedList toBeInserted, DoubleLinkedList tail){
        tail.setNext(toBeInserted);
        toBeInserted.setPrevious(tail);
        toBeInserted.setNext(null);
    }

    private boolean replaceHead(DoubleLinkedList toBeInserted){
        toBeInserted.setNext(this.head);
        toBeInserted.setPrevious(null);

        this.head.setPrevious(toBeInserted);
        this.head = toBeInserted;

        return true;
    }


    private void replaceOnFoundPosition( DoubleLinkedList toBeInserted, DoubleLinkedList currentNode){
        currentNode.getPrevious().setNext(toBeInserted);
        toBeInserted.setPrevious(currentNode.getPrevious());

        currentNode.setPrevious(toBeInserted);
        toBeInserted.setNext(currentNode);
    }

}
