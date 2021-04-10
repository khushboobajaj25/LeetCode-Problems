package LeetcodeProblems;

public class LinkedList_Cycle {
}
 class Solution141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow,fast;
        slow=fast=head;
        while(fast!=null &&fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
    class ListNode{
        ListNode next = null;
        int val =0;
    }
}