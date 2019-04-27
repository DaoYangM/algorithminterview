package top.daoyang.linkedlist;

public class RemoveDuplicate {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode curHead = head;

        while (curHead.next != null) {
            if (curHead.val == curHead.next.val) {
                curHead.next = curHead.next.next;
            } else {
                curHead = curHead.next;
            }
        }
        return head;
    }
}
