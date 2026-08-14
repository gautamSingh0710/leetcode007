class Solution {
    public ListNode doubleIt(ListNode head) {

        head = reverse(head);

        ListNode curr = head;
        int carry = 0;

        while (curr != null) {

            int val = curr.val * 2 + carry;

            curr.val = val % 10;
            carry = val / 10;

            if (curr.next == null)
                break;

            curr = curr.next;
        }

        // Agar last mein carry bacha
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return reverse(head);
    }

    ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}