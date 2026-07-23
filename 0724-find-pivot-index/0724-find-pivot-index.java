class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
       for(int f:nums) sum+=f;
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=sum-leftsum-nums[i];
            if(leftsum==rightsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna