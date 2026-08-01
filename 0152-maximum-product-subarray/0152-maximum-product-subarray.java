class Solution {
    public int maxProduct(int[] nums) {
       int prefix=1,suffix=1;
       int ans=-10;
       for(int i=0;i<nums.length;i++) 
       {
        if(prefix==0) prefix=1;
        if(suffix==0) suffix=1;
        prefix*=nums[i];
        suffix*=nums[nums.length-i-1];
        ans=Math.max(ans,Math.max(prefix,suffix));
       }
       return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna