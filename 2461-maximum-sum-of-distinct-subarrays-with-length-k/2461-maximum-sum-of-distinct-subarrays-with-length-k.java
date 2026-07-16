import java.util.HashMap;
import java.util.Map;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        long currentSum = 0;
        long maxSum = 0;

        // Process the first window of size k
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // If all elements in the first window are distinct
        if (map.size() == k) {
            maxSum = currentSum;
        }

        // Slide the window across the rest of the array
        for (int i = k; i < n; i++) {
            // Add the incoming element to the window
            currentSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Remove the outgoing element from the window
            int outElement = nums[i - k];
            currentSum -= outElement;
            if (map.get(outElement) == 1) {
                map.remove(outElement);
            } else {
                map.put(outElement, map.get(outElement) - 1);
            }

            // Check if the current window has exactly k distinct elements
            if (map.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna