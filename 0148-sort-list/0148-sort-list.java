class Solution {

    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null)
            return head;

        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode right=slow.next;
        slow.next=null;

        ListNode left=sortList(head);
        right=sortList(right);

        return merge(left,right);
    }

    private ListNode merge(ListNode a,ListNode b){

        ListNode dummy=new ListNode(-1);
        ListNode tail=dummy;

        while(a!=null && b!=null){

            if(a.val<b.val){

                tail.next=a;
                a=a.next;
            }
            else{

                tail.next=b;
                b=b.next;
            }

            tail=tail.next;
        }

        if(a!=null)
            tail.next=a;

        if(b!=null)
            tail.next=b;

        return dummy.next;
    }
}