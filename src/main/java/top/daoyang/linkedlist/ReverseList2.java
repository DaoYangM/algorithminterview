package top.daoyang.linkedlist;

public class ReverseList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode LN = null;

        if (head.next == null)
            return head;
        if (n - m == 0)
            return head;

        for (int i = 1; i < m; i++) {
            pre = cur;
            LN = cur;
            cur = cur.next;
        }

        for (int i = 0; i < n - m + 1; i++) {
            ListNode next = cur.next;

            cur.next = pre;
            pre = cur;
            cur = next;
        }
        
        ListNode nTail = LN.next;
        LN.next = pre;
        nTail.next = cur;

        return head;
    }

    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        ListNode dummy = head;
        for (int i = 2; i < 3; i++) {
            dummy.next = new ListNode(i);
            dummy = dummy.next;
        }
        
        ReverseList2 vList2 = new ReverseList2();
        ListNode reverseBetween = vList2.reverseBetween(head, 1, 2);

        while (reverseBetween != null) {
            System.out.println(reverseBetween.val);
            reverseBetween = reverseBetween.next;
        }
    }
}