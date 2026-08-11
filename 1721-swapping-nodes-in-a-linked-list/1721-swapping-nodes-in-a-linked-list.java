// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode swapNodes(ListNode head, int k) {
//         ListNode firs=head;
//         ListNode Second=head;
//         ListNode h=null;
//         ListNode prev1=null;
//         for(int i=0;i<k-1;i++){
//             prev1=first;
//             first=first.next;
            
//         }
//         h=first;
//         ListNode prev=null;
//         while(first!=null){
//             first=first.next;
//             prev=second;
//             second=second.next;
            
//         }
//         prev1=second;
//         second.next=prev;
//         prev=first;
//         first=second.next;

//     }
// }

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode kthFromStart = null;
        for(int i = 0; i < k - 1; i++){
            first = first.next;
        }
        kthFromStart = first;
        while(first.next != null){
            first = first.next;
            second = second.next;
        }
        int temp = kthFromStart.val;
        kthFromStart.val = second.val;
        second.val = temp;
        return head;
    }
}
