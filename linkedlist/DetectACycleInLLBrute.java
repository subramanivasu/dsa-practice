package linkedlist;

import java.util.HashSet;

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

public class DetectACycleInLLBrute {

    public static boolean hasCycle(ListNode head) {

        HashSet<ListNode> hashSet = new HashSet<>();

        ListNode current = head;
        if(head ==null || current.next==null){
            return false;
        }

        while(current.next!=null){
            if(hashSet.contains(current)){
                return true;
            }

            hashSet.add(current);
            current=current.next;
        }

        return false;
    }


    public static void main(String[] args) {
        System.out.println("Test Case 1: No Cycle");
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);

        System.out.println("Has Cycle? " + hasCycle(head1)); // Expected: false

        System.out.println("Test Case 2: Cycle at the end");
        ListNode head2 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        head2.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle: 40 -> 20
        System.out.println("Has Cycle? " + hasCycle(head2)); // Expected: true



    }
}