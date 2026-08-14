class Solution {
    public int pairSum(ListNode head) {

        if (head == null)
            return 0;

        if (head.next == null)
            return head.val;

        ListNode slow =head ;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        fast=head;
        int max=0;
        while(prev!=null){
           int sum=fast.val+prev.val;
            max=Math.max(max,sum);
           fast=fast.next;
           prev=prev.next;
        }
      return max;
       
    }
}