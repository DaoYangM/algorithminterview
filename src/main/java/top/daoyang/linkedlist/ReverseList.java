package top.daoyang.linkedlist;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        
        if (head == null) return null;

        ListNode newHead = null;
        
        if (head.next != null) {
            newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
        } else {
            newHead = head;
        }

        return newHead;
    }
}