package Trie;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Robert-PC on 8/28/2017.
 */
public class TrieManager {
    TrieNode origin;

    public TrieManager() {
        origin = new TrieNode('\0');
    }

    boolean search(char[] word) {
        return searchRecursive(Optional.of(origin), word, 0);
    }

    boolean searchRecursive(Optional<TrieNode> wordChecker, char[] word, int index) {
        if(word.length == 0)
            return true;

        wordChecker = isLetterAChild(wordChecker.orElse(new TrieNode('\0')), word[index]);
        if (!wordChecker.isPresent())
            return false;

        searchRecursive(wordChecker, word, index + 1);
        return false;
    }

    void insert(char[] word) {
        insertRecursive(origin, word, 0);
    }

    void insertRecursive(TrieNode current, char[] word, int index) {
        if(word.toString().indexOf(index) == -1)
            return;

        if(current.children.contains(word[index]))
            insertRecursive(current.children.get(index), word, index + 1);
        else{
            TrieNode newChild = new TrieNode(word[index]);
            current.children.add(newChild);
            insertRecursive(newChild, word, index + 1);
        }
    }

    private Optional<TrieNode> isLetterAChild(TrieNode current, char letter) {
        for (TrieNode child: current.children
             ) {
            if(child.getCurrentChar() == letter)
                return Optional.of(child);
        }

        return Optional.empty();
    }

}
