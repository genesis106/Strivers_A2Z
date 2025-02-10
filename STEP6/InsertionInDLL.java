package STEP6;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

public class InsertionInDLL {
    Node addNode(Node head, int p, int x) {
        if (head == null) {
            return new Node(x);
        }
        Node temp = head;
        Node temp2 = head;
        int length = 0;
        while (temp2 != null) {
            ++length;
            temp2 = temp2.next;
        }
        p %= length;

        while (p > 0) {
            temp = temp.next;
            --p;
        }
        Node addNode = new Node(x);
        addNode.next = temp.next;
        if (temp.next != null) { // Handle non-null next node
            temp.next.prev = addNode;
        }
        addNode.prev = temp;
        temp.next = addNode;
        return head;
    }

}
