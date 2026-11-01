class Solution {
    public int pairSum(ListNode head) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        int i = 0;
        int j = list.size() - 1;
        int ans = 0;
        
        while (i < j) {
            ans = Math.max(ans, list.get(i) + list.get(j));
            i++;
            j--;
        }
        
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna