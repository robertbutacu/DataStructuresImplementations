package Trie;

import Utils.Either;

import java.util.Optional;
import java.util.Random;

/**
 * Created by Robert-PC on 8/28/2017.
 */
public class TrieManager {
    private TrieNode origin;

    public TrieManager() {
        origin = new TrieNode('\0');
    }

    boolean search(char[] word) {
        return searchRecursive(Optional.of(origin), word, 0);
    }

    boolean searchRecursive(Optional<TrieNode> wordChecker, char[] word, int index) {
        if (word.length == index)
            return true;

        wordChecker = isLetterAChild(wordChecker.orElse(new TrieNode('\0')), word[index]);
        if (!wordChecker.isPresent())
            return false;

        return searchRecursive(wordChecker, word, index + 1);
    }

    void insert(char[] word) {
        insertRecursive(origin, word, 0);
    }

    void insertRecursive(TrieNode current, char[] word, int index) {
        if (word.length == index)
            return;

        Optional<TrieNode> child = isLetterAChild(current, word[index]);

        if (child.isPresent())
            insertRecursive(child.get(), word, index + 1);
        else {
            TrieNode newChild = new TrieNode(word[index]);
            current.children.add(newChild);
            insertRecursive(newChild, word, index + 1);
        }
    }

    void printAllLetters(TrieNode trieNode) {
        for (TrieNode a : trieNode.children
                ) {
            System.out.print(a.getCurrentChar() + " ");
            printAllLetters(a);
            if (a.getChildren().size() == 0)
                System.out.println("");
        }
    }

    private Optional<TrieNode> isLetterAChild(TrieNode current, char letter) {
        for (TrieNode child : current.children
                ) {
            if (child.getCurrentChar() == letter)
                return Optional.of(child);
        }

        return Optional.empty();
    }

    public Either<String, String> delete(char[] word) {
        return deleteRecursive(origin,
                new Either<>(),
                word,
                0);
    }

    private Either<String, String> deleteRecursive(TrieNode current,
                                                   Either<String, String> result,
                                                   char[] word,
                                                   int index) {
        for (TrieNode child: current.getChildren()
             ) {
            if(child.getCurrentChar() == word[index]){
                if(child.getChildren().size() == 0){
                    current.getChildren().remove(child);
                    result.setLeft(Optional.of("Word has been deleted"));
                    return result;
                }
                else{
                    return deleteRecursive(child, result, word, index + 1);
                }
            }
        }
        result.setRight(Optional.of("The word is not stored"));
        return result;
    }


    Either<String, String> test() {
        Either<String, String> result = new Either<String, String>();
        if (new Random().nextBoolean())
            result.setLeft(Optional.of("Problem"));
        else
            result.setRight(Optional.of("No problem"));
        return result;
    }

    public TrieNode getOrigin() {
        return origin;
    }
}
