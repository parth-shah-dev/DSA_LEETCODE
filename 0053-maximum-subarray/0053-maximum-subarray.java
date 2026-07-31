class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0],sum=0;
        for(int num : nums){
            sum+=num;
            maxsum=Math.max(sum,maxsum);
            if(sum<0){
            sum=0;
            }
        }
        return maxsum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna