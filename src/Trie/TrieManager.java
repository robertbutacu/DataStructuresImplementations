package Trie;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Robert-PC on 8/28/2017.
 */
public class TrieManager {
    TrieNode origin;

    public TrieManager()  {
        origin = new TrieNode('\0');
    }

    boolean searchWord(char[] word) {
        Optional<TrieNode> wordChecker = Optional.of(origin);
        for (char a: word
             ) {
            wordChecker = isLetterAChild(wordChecker.orElse(new TrieNode('\0')), a);
            if(!wordChecker.isPresent())
                return false;
        }
        return true;
    }

    Optional<TrieNode> isLetterAChild(TrieNode current, char letter)  {
        return Optional.ofNullable(current.children.get(current.children.indexOf(letter)));
    }

}
