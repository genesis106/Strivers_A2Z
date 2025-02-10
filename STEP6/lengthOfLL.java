package STEP6;

public class lengthOfLL {
    public int getCount(Node head) {
        // code here
        int  length=0;
        while(head!=null){
            ++length;
            head=head.next;
        }
        return length;
    }
}
