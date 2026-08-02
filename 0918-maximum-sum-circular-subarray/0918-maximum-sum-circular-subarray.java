class Solution {
    int max(int nums[],int n){
        int sum=nums[0],maxsum=nums[0];
        for(int i=1;i<n;i++){
            sum=Math.max(sum+nums[i],nums[i]);
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
        int min(int nums[],int n){
        int sum=nums[0],minsum=nums[0];
        for(int i=1;i<n;i++){
            sum=Math.min(sum+nums[i],nums[i]);
            minsum=Math.min(sum,minsum);
        }
        return minsum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int sum=Arrays.stream(nums).sum();
        int n=nums.length;
        int mins=min(nums,n);
        int maxs=max(nums,n);
        int cir=sum-mins;
        if(maxs>0) return Math.max(maxs,cir);
        return maxs;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna