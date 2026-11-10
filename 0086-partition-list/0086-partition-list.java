class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        
        ListNode smallDummy = new ListNode(0);
        ListNode largeDummy = new ListNode(0);
        ListNode small = smallDummy;
        ListNode large = largeDummy;
        ListNode current = head;
        
        while (current != null) {
            if (current.val < x) {
                small.next = current;
                small = small.next;
            } else {
                large.next = current;
                large = large.next;
            }
            current = current.next;
        }
        
        small.next = largeDummy.next;
        large.next = null;
        
        return smallDummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna