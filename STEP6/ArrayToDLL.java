package STEP6;

class Node {
    int data;
    Node next;
    Node prev;

    Node() {
        data = 0;
        next=null;
        prev=null;
    }

    Node(int d) {
        data = d;
        next=null;
        prev=null;
    }
}

public class ArrayToDLL {
    static Node constructDLL(int arr[]) {
        if (arr.length == 0) {
            return new Node();
        }
        if (arr.length == 1) {
            return new Node(arr[0]);
        }
        // Code here
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next=new Node(arr[i]);
            temp.next.prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        constructDLL(arr);
    }
}
