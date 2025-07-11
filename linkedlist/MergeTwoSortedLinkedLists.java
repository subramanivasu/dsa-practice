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

public class MergeTwoSortedLinkedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode current1 = list1;
        ListNode current2 = list2;

        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;

        while(current1!=null && current2!=null){
            if(current1.val<=current2.val){
                current.next=current1;
                current=current.next;
                current1=current1.next;
            } else{
                current.next=current2;
                current=current.next;
                current2=current2.next;
            }
        }

        while(current1!=null){
            current.next=current1;
            current=current.next;
            current1=current1.next;
        }

        while(current2!=null){
            current.next=current2;
            current=current.next;
            current2=current2.next;
        }

        return dummyNode.next;
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
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));
        ListNode mergedList = mergeTwoLists(list1, list2);
        printList(mergedList);
    }
}
