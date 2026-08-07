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
    public ListNode mergeNodes(ListNode head) {
        ListNode ss=new ListNode(0);
        ListNode s=ss;
        ListNode list=head.next;
        int sum=0;
        while(list!=null){
            if(list.val>0){
                sum+=list.val;
            }
            else if(list.val==0){
                    s.next=new ListNode(sum);
                      sum=0;
                      s=s.next;
                }
              
            

            list=list.next;
        }
        return ss.next;
    }
}