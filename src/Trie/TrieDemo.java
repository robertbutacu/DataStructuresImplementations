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
        trieManager.insert("abc".toCharArray());
        System.out.println(trieManager.search("abc".toCharArray()));

        trieManager.insert("robert".toCharArray());
        System.out.println(trieManager.search("robert".toCharArray()));


        System.out.println(trieManager.search("roberttt".toCharArray()));


    }
}
