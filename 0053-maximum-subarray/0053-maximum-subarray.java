class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize maxsum to the lowest possible integer to handle all-negative arrays
        int maxsum = Integer.MIN_VALUE; 
        int sum = 0;
        int minsum = 0; // Tracks the smallest prefix sum seen so far
        
        for (int num : nums) {
            sum += num;
            
            // 1. Calculate the best subarray ending at the current position
            maxsum = Math.max(maxsum, sum - minsum);
            
            // 2. Update the lowest prefix sum for future iterations
            minsum = Math.min(minsum, sum);
        }
        
        return maxsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna