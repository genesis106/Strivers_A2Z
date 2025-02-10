package TrieDS;

class Node {
    Node links[] = new Node[26];
    boolean flag = false;

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
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }

}

public class Trie2 {
    Node root;

    public Trie2() {
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

    
}
