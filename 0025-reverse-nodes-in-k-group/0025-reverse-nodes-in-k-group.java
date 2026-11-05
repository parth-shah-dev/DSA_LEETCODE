class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1)
            return head;
        ArrayList<Integer> list = new ArrayList<>();
        
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        for (int i = 0; i + k <= list.size(); i += k) {
            
            int left = i;
            int right = i + k - 1;
            
            while (left < right) {
                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                
                left++;
                right--;
            }
        }
        curr = head;
        int index = 0;
        while (curr != null) {
            curr.val = list.get(index++);
            curr = curr.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna