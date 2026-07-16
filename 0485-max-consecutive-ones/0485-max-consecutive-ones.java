class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int currentStreak = 0;
        
        for (int num : nums) {
            if (num == 1) {
                currentStreak++;
                // Update the maximum streak found so far
                if (currentStreak > maxOnes) {
                    maxOnes = currentStreak;
                }
            } else {
                // Reset the streak when hitting a 0
                currentStreak = 0;
            }
        }
        
        return maxOnes;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna