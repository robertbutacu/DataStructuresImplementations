package DoubleLinkedList;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Robert-PC on 7/2/2017.
 */
public class DoubleLinkedList {
    private int ID;

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(0);

    private String streetName;

    private int familyCount;

    public int getID() {
        return ID;
    }


    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getFamilyCount() {
        return familyCount;
    }

    public void setFamilyCount(int familyCount) {
        this.familyCount = familyCount;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public DoubleLinkedList getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedList previous) {
        this.previous = previous;
    }

    public DoubleLinkedList getNext() {
        return next;
    }

    public void setNext(DoubleLinkedList next) {
        this.next = next;
    }

    private int wealth;

    private DoubleLinkedList previous;

    private DoubleLinkedList next;


    //insertion
    public DoubleLinkedList(String streetName, int familyCount, int wealth, DoubleLinkedList previous, DoubleLinkedList next){
        this.ID = ID_GENERATOR.getAndIncrement();
        this.streetName = streetName;
        this.familyCount = familyCount;
        this.wealth = wealth;

        this.previous = previous;
        this.previous.setNext(this);

        this.next = next;
        this.next.setPrevious(this);
    }

    //last node
    public DoubleLinkedList(String streetName, int familyCount, int wealth, DoubleLinkedList previous){
        this.ID = ID_GENERATOR.getAndIncrement();
        this.streetName = streetName;
        this.familyCount = familyCount;
        this.wealth = wealth;

        this.previous = previous;
        this.previous.setNext(this);

        this.next = null;
    }

    //first node
    public DoubleLinkedList(String streetName, int familyCount, int wealth){
        this.ID = ID_GENERATOR.getAndIncrement();
        this.streetName = streetName;
        this.familyCount = familyCount;
        this.wealth = wealth;
        this.previous = null;
        this.next = null;
    }

}
