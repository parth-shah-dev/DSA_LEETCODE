class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        
        while (curr != null) {
            // Check if current node has duplicates ahead
            if (curr.next != null && curr.val == curr.next.val) {
                // Skip all nodes with the duplicate value
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                // Connect previous to the node after the duplicates
                prev.next = curr.next;
            } else {
                // No duplicate found, move prev pointer forward
                prev = prev.next;
            }
            // Move current pointer forward
            curr = curr.next;
        }
        
        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna