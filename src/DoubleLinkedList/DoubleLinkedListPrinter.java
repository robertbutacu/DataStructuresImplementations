package DoubleLinkedList;

/**
 * Created by Robert-PC on 7/2/2017.
 */
public class DoubleLinkedListPrinter {

    DoubleLinkedListManager doubleLinkedListManager;


    public DoubleLinkedListPrinter(DoubleLinkedListManager doubleLinkedListManager) {
        this.doubleLinkedListManager = doubleLinkedListManager;
    }

    public DoubleLinkedListPrinter() {
        this.doubleLinkedListManager = null;
    }


    public void printInfo() {
        DoubleLinkedList iterator = doubleLinkedListManager.getHead();

        if (iterator == null) {
            System.out.println("The Double Linked List is empty.");
        }

        while (iterator != null) {
            System.out.println("House ID " +
                    iterator.getID() +
                    ". Street Name " +
                    iterator.getStreetName() +
                    ". Wealth :" +
                    iterator.getWealth());
            if (iterator.getNext() != null)
                System.out.println("Front neighbour ID : " + iterator.getNext().getID());
            else
                System.out.println("No front neighbour.");

            if (iterator.getPrevious() != null)
                System.out.println("Back neighbour ID : " + iterator.getPrevious().getID());
            else
                System.out.println("No back neighbour.");

            System.out.println("\n\n\n");
            iterator = iterator.getNext();
        }
    }


    public DoubleLinkedListManager getDoubleLinkedListManager() {
        return doubleLinkedListManager;
    }

    public void setDoubleLinkedListManager(DoubleLinkedListManager doubleLinkedListManager) {
        this.doubleLinkedListManager = doubleLinkedListManager;
    }

}
