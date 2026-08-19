class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] a = {-1, -1};

        int cu = 1;
        int first = -1;
        int last = -1;

        ListNode temp = head;
        ListNode curr = head.next;

        int min = Integer.MAX_VALUE;

        while (curr != null && curr.next != null) {

            ListNode next = curr.next;

            if ((curr.val > temp.val && curr.val > next.val) ||
                (curr.val < temp.val && curr.val < next.val)) {

                if (first == -1) {
                    first = cu;
                } else {
                    min = Math.min(min, cu - last);
                }

                last = cu;
            }

            temp = curr;
            curr = next;
            cu++;
        }

        if (first != -1 && first != last) {
            a[0] = min;
            a[1] = last - first;
        }

        return a;
    }
}