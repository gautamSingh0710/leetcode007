/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode right=slow.next;
        slow.next=null;

        right=sortList(right);
        ListNode left=sortList(head);
    return merge(left,right);
    }
     public ListNode merge(ListNode a,ListNode b){
        ListNode current=new ListNode(-1);
        ListNode dummy=current;
        while(a!=null && b!=null){
            if(a.val<b.val){
             current.next=a;
              a = a.next;
            }
            else{
                current.next=b;
                b = b.next;
            }
            current=current.next;
        }
        if(a!=null){
            current.next=a;

        }
        else{
            current.next=b;
        }
     


      return dummy.next;  
    }
}