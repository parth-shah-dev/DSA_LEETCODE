class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0,product=1,left=0;
        if(k<=1) return 0;
        for(int right=0;right<nums.length;right++){
            product=product*nums[right];
            while(product>=k) {
                product /= nums[left];
                left++;
            }
            count += right-left+1;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna