class Solution {
    public int pairSum(ListNode head) {

        if (head == null)
            return 0;

        if (head.next == null)
            return head.val;

        ListNode temp = head;

        // length nikalna
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int[] arr = new int[n];

        temp = head;
        int i = 0;

        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }

        int max = 0;

        for (i = 0; i < n / 2; i++) {
            int sum = arr[i] + arr[n - 1 - i];
            max = Math.max(max, sum);
        }

        return max;
    }
}