package DoubleLinkedList;

/**
 * Created by Robert-PC on 7/2/2017.
 */
public class DoubleLinkedListManager {
    private DoubleLinkedList head;
    private DoubleLinkedList tail;

    private int length;

    public DoubleLinkedListManager(DoubleLinkedList head) {
        this.head = head;
        this.tail = head;
        length += 1;
    }

    public DoubleLinkedList getHead() {
        return head;
    }

    public DoubleLinkedList getTail() {
        return tail;
    }

    public DoubleLinkedListManager() {

    }

    public int getLength() {
        return this.length;
    }


    public boolean insertHouseAfterPosition(int position, DoubleLinkedList toBeInserted) {
        if (position < 0)
            return false;

        //replacing head
        if (position == 0) {
            return replaceHead(toBeInserted);
        }

        DoubleLinkedList iterator = this.head;
        int currentPosition = 0;

        while (iterator != null) {
            //found position
            if (currentPosition == position) {
                replaceOnFoundPosition(toBeInserted, iterator);

            }

            //position outside of linked list's range
            if ((currentPosition + 1) < position && iterator.getNext() == null) {
                replaceTail(toBeInserted, iterator);

            }

            iterator = iterator.getNext();
            currentPosition += 1;
        }
        this.length += 1;
        return true;

    }

    public void add(DoubleLinkedList newItem) {
        //null list
        if (this.head == null) {
            this.head = newItem;
            this.tail = newItem;
            this.length += 1;
            return;
        }

        newItem.setPrevious(tail);
        newItem.setNext(null);

        tail.setNext(newItem);
        tail = newItem;

        this.length += 1;
    }

    public void deleteHouseById(int id) {
        DoubleLinkedList iterator = this.head;

        while (iterator != null) {
            if (iterator.getID() == id) {
                //checking whether its not the last node
                if (iterator.getNext() != null)
                    iterator.getNext().setPrevious(iterator.getPrevious());

                if (iterator.getPrevious() != null)
                    iterator.getPrevious().setNext(iterator.getNext());
                    //its the head :/ the king has died, long live the king.
                else
                    this.head = iterator.getNext();
                System.out.println("House deleted.");
                this.length -= 1;
            }

            iterator = iterator.getNext();
        }

    }

    private void replaceTail(DoubleLinkedList toBeInserted, DoubleLinkedList tail) {
        tail.setNext(toBeInserted);
        toBeInserted.setPrevious(tail);
        toBeInserted.setNext(null);
    }

    private boolean replaceHead(DoubleLinkedList toBeInserted) {
        toBeInserted.setNext(this.head);
        toBeInserted.setPrevious(null);

        this.head.setPrevious(toBeInserted);
        this.head = toBeInserted;

        return true;
    }


    private void replaceOnFoundPosition(DoubleLinkedList toBeInserted, DoubleLinkedList currentNode) {
        currentNode.getPrevious().setNext(toBeInserted);
        toBeInserted.setPrevious(currentNode.getPrevious());

        currentNode.setPrevious(toBeInserted);
        toBeInserted.setNext(currentNode);
    }

}
