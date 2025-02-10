package LinkedLists;

public class InsertionAtEnd {
    Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next=new Node(x);
        return head;
    }
}
