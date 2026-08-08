import java.util.HashSet;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        // Head ke unwanted nodes hatao
        while (head != null && set.contains(head.val)) {
            head = head.next;
        }

        ListNode temp = head;

        while (temp != null && temp.next != null) {

            if (set.contains(temp.next.val)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}