package TrieDS;

public class completeString {
    public static String completeString(int n, String[] a) {
        Trie2 trie = new Trie2();
        for (String str : a) {
            trie.insert(str);
        }
        int len = 0;
        String s = "None";
        for (String str : a) {
            Node node = trie.root;
            boolean valid = true;
            for (int i = 0; i < str.length(); i++) {
                if (node.containsKey(str.charAt(i))) {
                    node = node.get(str.charAt(i));
                    if (!node.isEnd()) {
                        valid = false;
                        break;
                    }
                } else {
                    valid = false;
                    break;
                }
            }
            if (valid&&(str.length() > len || (str.compareTo(s) < 0 && str.length() == len))) {
                len = str.length();
                s = str;
            }
        }

        return s;

    }

    public static void main(String[] args) {
        System.out.println(completeString(6, new String[] { "n", "ni", "nin", "ninj", "ninja", "ninga" }));
    }
}
