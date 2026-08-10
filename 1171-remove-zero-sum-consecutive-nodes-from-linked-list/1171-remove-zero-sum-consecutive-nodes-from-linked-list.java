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
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head==null)return null;
        HashMap<Integer,ListNode>map=new HashMap<>();
        ListNode dummy=new ListNode(0,head);
        ListNode curr=dummy;
        int prefix=0;
           while (curr != null) {
            prefix += curr.val;
            map.put(prefix, curr);
            curr = curr.next;
        }

        // Second pass
        prefix = 0;
        curr = dummy;

        while (curr != null) {
            prefix += curr.val;

            curr.next = map.get(prefix).next;

            curr = curr.next;
        }
        return dummy.next;

        
    }
}