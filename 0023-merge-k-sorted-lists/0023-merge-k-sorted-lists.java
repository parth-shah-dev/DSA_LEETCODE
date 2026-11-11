class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (ListNode head : lists) {
            while (head != null) {
                nums.add(head.val);
                head = head.next;
            }
        }

        Collections.sort(nums);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int num : nums) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna