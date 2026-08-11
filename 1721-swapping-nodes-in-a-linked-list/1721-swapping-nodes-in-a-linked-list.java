class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = head;
        ListNode second = head;

        ListNode prev1 = dummy;

        // kth node from beginning
        for (int i = 1; i < k; i++) {
            prev1 = first;
            first = first.next;
        }

        // kth node from end
        ListNode temp = first;
        ListNode prev2 = dummy;

        while (temp.next != null) {
            temp = temp.next;
            prev2 = second;
            second = second.next;
        }

        // Nodes are adjacent
        if (first.next == second) {
            prev1.next = second;
            first.next = second.next;
            second.next = first;
        }
        else if (second.next == first) {
            prev2.next = first;
            second.next = first.next;
            first.next = second;
        }
        else {
            // Normal case
            prev1.next = second;
            prev2.next = first;

            ListNode tempNext = first.next;
            first.next = second.next;
            second.next = tempNext;
        }

        return dummy.next;
    }
}