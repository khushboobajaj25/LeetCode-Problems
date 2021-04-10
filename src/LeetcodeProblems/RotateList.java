package LeetcodeProblems;

public class RotateList {
}


class Solution61 {//1ms

    public ListNode rotateRight(ListNode head, int k) {
        ListNode p = head, prev = null;
        int count = 0;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        int siz = size(head);
        while (count != k % siz) {
            while (p.next != null) {
                prev = p;
                p = p.next;
            }

            p.next = head;
            head = p;
            p = head;
            if (prev != null) {
                prev.next = null;
                prev = prev.next;
            }

            count++;
        }
        return head;
    }

    public int size(ListNode p) {

        int s = 0;
        while (p != null) {
            p = p.next;
            s++;
        }
        return s;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}