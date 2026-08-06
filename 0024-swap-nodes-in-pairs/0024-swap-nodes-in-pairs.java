class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode first = head;
        ListNode second = head.next;

        // Baaki list ko recursively swap karo
        first.next = swapPairs(second.next);

        // Pehle do nodes swap karo
        second.next = first;

        return second;
    }
}