package Trie;

import sun.text.normalizer.Trie;

/**
 * Created by Robert-PC on 8/28/2017.
 */
public class TrieDemo {
    TrieManager trieManager;

    public TrieDemo() {
        trieManager = new TrieManager();
    }

    public void getDemo() {
        System.out.println("Inserting the word test ...");
        trieManager.insert("test".toCharArray());
        System.out.println("Is test in the trie : " + trieManager.search("abc".toCharArray()));

        System.out.println("Inserting the word anotherTest");
        trieManager.insert("anotherTest".toCharArray());
        System.out.println("Is anotherTest in the trie: " + trieManager.search("anotherTest".toCharArray()));

        System.out.println("Insert the word tasta");
        trieManager.insert("tast".toCharArray());


        System.out.println("Inserting the word anotherTast");
        trieManager.insert("anotherTast".toCharArray());
        System.out.println("Is anotherTest in the trie: " + trieManager.search("anotherTast".toCharArray()));

        System.out.println("Is anotherTist in the trie: " + trieManager.search("anotherTist".toCharArray()));
        System.out.println("Printing all letters from the trie ( should be somehow hierarchical) ");
        trieManager.printAllLetters(trieManager.getOrigin());

        System.out.println("Deleting test " + trieManager.delete("test".toCharArray()).get().get());

        System.out.println("Deleting tgst " + trieManager.delete("tgst".toCharArray()).get().get());

        System.out.println("Deleting testt " + trieManager.delete("tgst".toCharArray()).get().get());

        System.out.println("Printing all letters from the trie ( should be somehow hierarchical) ");
        trieManager.printAllLetters(trieManager.getOrigin());

        System.out.println("Testing either : " + trieManager.test().get().get());
    }
}
