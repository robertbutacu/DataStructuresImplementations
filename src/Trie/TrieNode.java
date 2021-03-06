package Trie;

import java.util.*;

/**
 * Created by Robert-PC on 8/28/2017.
 */
public class TrieNode {
    char currentChar = 0;
    ArrayList<TrieNode> children = new ArrayList<>();

    public TrieNode(char currentChar, ArrayList<TrieNode> children) {
        this.currentChar = currentChar;
        this.children = children;
    }

    public TrieNode(char currentChar) {
        this.currentChar = currentChar;
    }

    public char getCurrentChar() {
        return currentChar;
    }


    public ArrayList<TrieNode> getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrieNode trieNode = (TrieNode) o;

        return currentChar == trieNode.currentChar;
    }

    @Override
    public int hashCode() {
        return (int) currentChar;
    }
}
