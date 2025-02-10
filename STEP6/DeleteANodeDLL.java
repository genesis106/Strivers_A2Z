package STEP6;

public class DeleteANodeDLL {
    public Node deleteNode(Node head, int x) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            ++length;
            temp = temp.next;
        }
        if (x != length) {
            x %= length;
        }
        Node temp2 = head;

        while (x > 0) {
            --x;
            temp2 = temp2.next;
        }
        temp2.next=temp2.next.next;
        return head;
    }
}
