class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            ListNode n = temp;
            ListNode next = temp.next;

            int a = n.val;
            int b = next.val;

            int gcd = 1;

            // GCD find karna
            for (int i = Math.min(a, b); i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                    break;
                }
            }

            // New node create
            ListNode add = new ListNode(gcd);

            // Insert between n and next
            n.next = add;
            add.next = next;

            // Original next node par move
            temp = next;
        }

        return head;
    }
}