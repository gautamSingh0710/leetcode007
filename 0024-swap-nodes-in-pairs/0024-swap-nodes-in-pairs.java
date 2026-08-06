class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {

            ListNode curr = prev.next;
            ListNode next = curr.next;

            curr.next = next.next;
            next.next = curr;
            prev.next = next;

            prev = curr;
        }

        return dummy.next;
    }
}