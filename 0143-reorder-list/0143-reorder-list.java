class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        
        // 1. Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // 2. Reverse the second half
        ListNode second = slow.next;
        slow.next = null; // Break the list into two halves
        ListNode prev = null;
        ListNode curr = second;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // 3. Merge the two halves
        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode next1 = first.next;
            ListNode next2 = second.next;
            
            first.next = second;
            second.next = next1;
            
            first = next1;
            second = next2;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna