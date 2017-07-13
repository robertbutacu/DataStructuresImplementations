package BinarySearchTree;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Robert-PC on 7/5/2017.
 */
public class TreeNode {
    private int data;

    private int id;

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(0);

    private String username;

    private TreeNode right;

    private TreeNode left;



    public TreeNode(int data){
        this.data = data;
        this.id = ID_GENERATOR.getAndIncrement();
    }

    public TreeNode(int data, String username){
        this.data = data;
        this.username = username;
        this.id = ID_GENERATOR.getAndIncrement();
    }


    public int getData() {
        return data;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setData(int newData){
        this.data = newData;
    }

    public static AtomicInteger getIdGenerator() {
        return ID_GENERATOR;
    }

    public static void setIdGenerator(AtomicInteger idGenerator) {
        ID_GENERATOR = idGenerator;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
