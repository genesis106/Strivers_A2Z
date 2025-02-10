package TrieDS;

import java.util.ArrayList;

class Node {
    Node links[] = new Node[26];
    int countPrefix = 0;
    int countEnd = 0;

    boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    void put(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    Node get(char ch) {
        return links[ch - 'a'];
    }

    void setEnd() {
        countEnd += 1;
    }

    boolean isEnd() {
        return countEnd != 0;
    }

    void increaseEnd() {
        ++countEnd;
    }

    void decreaseEnd() {
        --countEnd;
    }

    void markPrefix() {
        ++countPrefix;
    }

    void reducePrefix() {
        --countPrefix;
    }

    int getEnd() {
        return countEnd;
    }

    int getPrefix() {
        return countPrefix;
    }
}

public class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    // Insert a word into the Trie
    void insert(String word) {
        Node node = root; // Start from the root
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.containsKey(ch)) {
                node.put(ch, new Node()); // Create a new node if it doesn't exist
            }
            node = node.get(ch); // Move to the next node
            node.markPrefix();

        }
        node.setEnd(); // Mark the end of the word
    }

    // Search for a word in the Trie
    boolean search(String word) {
        Node node = root; // Use a temporary node to traverse
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!node.containsKey(ch)) {
                return false;
            }
            node = node.get(ch); // Move to the next node
        }
        return node.isEnd(); // Check if it's the end of a valid word
    }

    // Check if there is any word in the Trie that starts with the given prefix
    boolean startsWith(String prefix) {
        Node node = root; // Use a temporary node to traverse
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (!node.containsKey(ch)) {
                return false;
            }
            node = node.get(ch); // Move to the next node
        }
        return true; // If traversal completes, the prefix exists
    }

    public int countWordsEqualTo(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.containsKey(ch)) {
                node = node.get(ch);
            } else {
                return 0;
            }
        }
        if (!node.isEnd()) {
            return 0;
        }
        return node.getEnd();
    }

    public int countWordsStartingWith(String prefix) {
        Node node = root;
        for (int i = 0; i < prefix.length(); i++) { // Traverse through the prefix
            char ch = prefix.charAt(i);
            if (node.containsKey(ch)) {
                node = node.get(ch);
            } else {
                return 0; // Prefix not found
            }
        }
        if (node.isEnd()) {
            return node.getEnd();
        }
        return node.getPrefix(); // Return the count of words with this prefix
    }

    public void erase(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (node.containsKey(ch)) {
                node = node.get(ch);
            } else {
                return;
            }
        }
        if (!node.isEnd()) {
            return;
        }
        node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            node.reducePrefix();
            node = node.get(ch);
        }
        node.decreaseEnd();
    }

    public String returnLongestCommonPrefix(String prefix, int number) {
        Node node = root;
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < prefix.length(); i++) { // Traverse through the prefix
            char ch = prefix.charAt(i);
            if (node.containsKey(ch) && node.getPrefix() == number) {
                str.append(ch);
                node = node.get(ch);
            } else {
                break;
            }
        }
        return str.toString(); // Return the count of words with this prefix
    }

    public static String longestCommonPrefix(String[] strs) {
        Trie trie = new Trie();
        for (String str : strs) {
            trie.insert(str);
        }
        return trie.returnLongestCommonPrefix(strs[0], strs.length);
    }

    public static void main(String[] args) {
        longestCommonPrefix(new String[] { "flower", "flow", "flight" });
    }
}

class Solution {

}