class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int zc=0;
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc++;
            }
            if(zc>k){
                if(nums[left]==0) zc--;
                left++;
            }
        }
        return i-left;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna