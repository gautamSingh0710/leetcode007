class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            ListNode n = temp;
            int na = temp.val;

            temp = temp.next;
            int b = temp.val;

            int a = na;

            // GCD using Euclidean Algorithm
            while (b != 0) {
                int rem = a % b;
                a = b;
                b = rem;
            }

            ListNode add = new ListNode(a);

            n.next = add;
            add.next = temp;

        }

        return head;
    }
}