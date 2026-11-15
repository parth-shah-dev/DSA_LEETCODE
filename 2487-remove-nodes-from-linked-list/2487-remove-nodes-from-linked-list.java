class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;

        while (curr != null) {
            while (!stack.isEmpty() && stack.peek().val < curr.val) {
                stack.pop();
            }
            stack.push(curr);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (ListNode node : stack) {
            tail.next = node;
            tail = tail.next;
        }

        tail.next = null;
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna