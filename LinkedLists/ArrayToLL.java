package LinkedLists;

class Node {
    int data;
    Node next;

    Node() {
        data = 0;
    }

    Node(int d) {
        data = d;
    } // constructor to create a new node
}

public class ArrayToLL {
    static Node constructLL(int arr[]) {
        if (arr.length == 0) {
            return new Node();
        }
        Node head = new Node(arr[0]);

        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
}
