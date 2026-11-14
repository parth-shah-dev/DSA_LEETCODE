class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode curr = head;
        
        // Step 1: Traverse the linked list and store values in an ArrayList
        while (curr != null) {
            ans.add(curr.val);
            curr = curr.next;
        }
        
        int[] result = new int[ans.size()];
        Stack<Integer> stack = new Stack<>();
        
        // Step 2: Iterate from right to left to find the next greater element using a stack
        for (int i = ans.size() - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= ans.get(i)) {
                stack.pop();
            }
            
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            } else {
                result[i] = 0; // Default if no greater element exists
            }
            
            stack.push(ans.get(i));
        }
        
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna