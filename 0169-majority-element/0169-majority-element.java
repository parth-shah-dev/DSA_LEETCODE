import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int threshold = nums.length / 2;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            if (count > threshold) {
                return num;
            }
            map.put(num, count);
        }

        return -1; 
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna