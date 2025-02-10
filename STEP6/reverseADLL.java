package STEP6;
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
public class reverseADLL {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head==null){
            return head;
        }
        head.next=head.prev.next;
        head.prev=
    }
}
