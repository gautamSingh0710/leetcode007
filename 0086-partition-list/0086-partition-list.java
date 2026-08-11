class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode lessDummy = new ListNode(-1);
        ListNode greaterDummy = new ListNode(-1);
        ListNode less=lessDummy;
        ListNode greator=greaterDummy;
        while(temp!=null){
            if(temp.val < x){
                less.next=temp;
                less = less.next;
            }
            else if(temp.val>=x){
               greator.next=temp;
               greator = greator.next;
            }
            temp=temp.next;
        }
        greator.next=null;

        less.next=greaterDummy.next;
        return lessDummy.next;

    }
}