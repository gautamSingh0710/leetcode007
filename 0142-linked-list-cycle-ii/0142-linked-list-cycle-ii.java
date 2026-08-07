public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                temp = slow;
                break;
            }
        }

        // No cycle
        if (temp == null)
            return null;

        fast = head;

        while (fast != temp) {
            fast = fast.next;
            temp = temp.next;
        }

        return fast;
    }
}