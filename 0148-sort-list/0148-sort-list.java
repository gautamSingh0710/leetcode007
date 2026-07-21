class Solution {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(arr);

        curr = head;

        for (int x : arr) {
            curr.val = x;
            curr = curr.next;
        }

        return head;
    }
}