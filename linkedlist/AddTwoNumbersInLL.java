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

public class AddTwoNumbersInLL {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;
        int carry = 0;
        while(l1!=null || l2!=null){
            int sum=0;
            sum+=carry;
            if(l1!=null){sum+=l1.val;}
            if(l2!=null){sum+=l2.val;}

            ListNode newNode = new ListNode(sum%10);
            carry=sum/10;
            current.next = newNode;
            current=newNode;

            if(l1!=null){l1=l1.next;}
            if(l2!=null){l2=l2.next;}
        }

        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
            current = newNode;
        }   

        return dummyNode.next;
    }
    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print((int)temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode l1_ex1 = new ListNode(2);
        l1_ex1.next = new ListNode(4);
        l1_ex1.next.next = new ListNode(3);

        ListNode l2_ex1 = new ListNode(5);
        l2_ex1.next = new ListNode(6);
        l2_ex1.next.next = new ListNode(4);

        System.out.print("List 1 (Ex1): ");
        printList(l1_ex1);
        System.out.print("List 2 (Ex1): ");
        printList(l2_ex1);
        ListNode result1 = addTwoNumbers(l1_ex1, l2_ex1);
        System.out.print("Result (Ex1): ");
        printList(result1); 
    }

}
