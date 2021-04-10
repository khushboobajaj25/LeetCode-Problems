package LeetcodeProblems;

public class AddTwoNumbers {
}
class Solution2{
    ListNode result;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        int carry =0;
        int sum =0,data =0;
        while(p!=null && q!=null){
            sum = p.val+q.val+carry;
            carry = sum/10;
            data = sum%10;
            insert_end(data);
            p = p.next;
            q = q.next;
        }
        if(p == null){
            while(q!=null){
                sum = q.val+carry;
                carry = sum/10;
                data = sum%10;
                insert_end(data);
                q = q.next;
            }
        }
        else if(q == null){
            while(p!=null){
                sum = p.val+carry;
                carry = sum/10;
                data = sum%10;

                insert_end(data);
                p = p.next;
            }
        }
        if(carry!=0){
            insert_end(carry);
        }
        return result;
    }
    public void insert_end(int data){
        ListNode ptr = new ListNode(data);
        if(result == null){
            result = ptr;

        }
        else{
            ListNode p = result;
            while(p.next!=null){
                p = p.next;
            }
            p.next = ptr;
            p = ptr;
        }
    }
     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}