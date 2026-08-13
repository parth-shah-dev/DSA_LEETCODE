class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[mid] >= nums[left]) { 
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target lies in the left sorted portion
                } else {
                    left = mid + 1;  // Target lies in the right portion
                }
            } 
            // Otherwise, the right half is sorted
            else { 
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;  // Target lies in the right sorted portion
                } else {
                    right = mid - 1; // Target lies in the left portion
                }
            }
        }

        return -1; // Target not found
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna