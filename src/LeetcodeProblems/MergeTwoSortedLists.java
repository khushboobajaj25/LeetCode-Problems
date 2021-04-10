package LeetcodeProblems;

public class MergeTwoSortedLists {
}
class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p =l2;
        while(p!=null){
            l1 = insert(p.val,l1);
            p = p.next;
        }
        return l1;
    }
    public ListNode insert(int key,ListNode l1){
        ListNode p =l1;
        ListNode follow = null;
        ListNode ptr = new ListNode(key);
        while(p!=null && key>=p.val){
            follow = p;
            p = p.next;
        }
        if(p==l1){
            ptr.next = p;
            l1 = ptr;

        }
        else if(p==null){
            follow.next = ptr;
        }
        else{
            follow.next = ptr;
            ptr.next = p;


        }
        return l1;
    }
}
class ListNode{
    ListNode next = null;
    int val = 0;

    public ListNode(int key) {

    }
}