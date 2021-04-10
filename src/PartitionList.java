public class PartitionList {
}
class Solution86 {
    ListNode result;

    public ListNode partition(ListNode head, int x) {
        ListNode p = head, q, r;
        while (p != null) {
            if (p.val < x) {
                insertAfter(p.val);
            }
            p = p.next;
        }
        p = head;
        while (p != null) {
            if (p.val >= x) {
                insertAfter(p.val);
            }
            p = p.next;
        }

        return result;
    }

    public void insertAfter(int data) {
        ListNode ptr = new ListNode(data);
        ListNode p = result;
        if (result == null) {
            result = ptr;
        } else {
            while (p.next != null) {
                p = p.next;
            }
            p.next = ptr;

        }
    }

    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}