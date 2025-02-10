package LinkedLists;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class SearchinLinkedList {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        while (head != null) {
            if (head.data == key) {
                return true;
            }
            head=head.next;
        }return false;
    }
}
