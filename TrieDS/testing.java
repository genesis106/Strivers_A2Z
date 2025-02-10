package TrieDS;

public class testing {
    public static void main(String[] args) {
        Trie trie = new Trie();
Trie2 t2=new Trie2();
        trie.insert("fr");
        trie.insert("dfweafeedsaf");
        trie.insert("ergersd");
        System.out.println(trie.countWordsEqualTo("dfweafeedsaf"));
        System.out.println(trie.countWordsStartingWith("ew"));
        trie.insert("sdfs");
        trie.insert("wrwe");
        System.out.println(trie.countWordsEqualTo(""));
        t2.insert("hi");
        t2.insert("hiya");
        t2.insert("ho");
        t2.insert("hiop");
        t2.insert("hikl");
        t2.insert("hik");

        System.out.println(t2.search("ho"));
        System.out.println(t2.search("hio"));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
