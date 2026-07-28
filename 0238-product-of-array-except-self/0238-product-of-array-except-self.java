class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        
        res[0] = 1;
        
        for(int i = 1; i < n; i++){
            res[i] = res[i-1] * nums[i-1];
        }
        
        int rightProd = 1; // Fixed name mismatch here
        
        for(int r = n-1; r >= 0; r--){
            res[r] = res[r] * rightProd;
            rightProd *= nums[r];
        }
        
        return res; // Added missing return statement
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna