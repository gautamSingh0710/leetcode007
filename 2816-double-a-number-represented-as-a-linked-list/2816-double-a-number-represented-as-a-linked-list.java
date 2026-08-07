import java.math.BigInteger;

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
    public ListNode doubleIt(ListNode head) {

        StringBuilder sb = new StringBuilder();
        ListNode temp = head;

        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }

        BigInteger num = new BigInteger(sb.toString());
        num = num.multiply(BigInteger.valueOf(2));

        String ans = num.toString();

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = 0; i < ans.length(); i++) {
            curr.next = new ListNode(ans.charAt(i) - '0');
            curr = curr.next;
        }

        return dummy.next;
    }
}