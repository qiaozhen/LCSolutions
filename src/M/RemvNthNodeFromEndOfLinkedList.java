package M;

/**
 * Created by qiaozhen on 31/07/2017.
 */


public class RemvNthNodeFromEndOfLinkedList {
    public static class ListNode {
        public int value;
        public ListNode next;
        public ListNode(int x) {
            value = x;
        }
    }

    public ListNode solution (ListNode head, int n) {
        ListNode bh = head;
        ListNode ah = head;

        for (int i = 0; i < n; i++) {
            ah = ah.next;
            if (ah == null) return head.next;
        }

        while (ah.next != null) {
            bh = bh.next;
            ah = ah.next;
        }
        bh.next = bh.next.next;

        return head;
    }
}
