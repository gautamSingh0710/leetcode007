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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        fast=null;
        while(second!=null){
         ListNode Next=second.next;
         second.next=fast;
         fast=second;
         second=Next;
        }
        temp=head;
        while(fast!=null){
            ListNode Next=temp.next;
            ListNode n=fast.next;
            temp.next=fast;
            fast.next=Next;
            temp=Next;
            fast=n;
        }
        return ;
    }
}