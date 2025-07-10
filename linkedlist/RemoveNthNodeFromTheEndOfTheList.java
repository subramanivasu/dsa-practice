package linkedlist;

class ListNode {
    double val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(double data1) {
        val = data1;
        next = null;
    }

    ListNode(double data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class RemoveNthNodeFromTheEndOfTheList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        for(int i=0;i<n;i++){
            fastPointer=fastPointer.next;
        }

        if(fastPointer==null){
            return head.next;
        }

        while(fastPointer.next!=null){
            fastPointer=fastPointer.next;
            slowPointer=slowPointer.next;
        }

        ListNode delNode = slowPointer.next;
        slowPointer.next = delNode.next;
        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print((int)temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.print("Original List 1: ");
        printList(head1);
        ListNode result1 = removeNthFromEnd(head1, 2);
        System.out.print("After removing 2nd from end: ");
        printList(result1);

        ListNode head2 = new ListNode(1);
        System.out.print("Original List 2: ");
        printList(head2);
        ListNode result2 = removeNthFromEnd(head2, 1);
        System.out.print("After removing 1st from end: ");
        printList(result2);

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        System.out.print("Original List 3: ");
        printList(head3);
        ListNode result3 = removeNthFromEnd(head3, 2);
        System.out.print("After removing 2nd from end: ");
        printList(result3);
    }
}