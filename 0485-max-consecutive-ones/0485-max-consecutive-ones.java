class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,con=0;
        for(int n:nums){
            if(n==1){
                con++;
            }else{
                
                con=0;
            }
            max=Math.max(con,max);
        }
        
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna