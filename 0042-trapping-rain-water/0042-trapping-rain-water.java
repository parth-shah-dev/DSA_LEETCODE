class Solution {
    public int trap(int[] height) {
        
        int left=0,right=height.length-1,left_max=height[left],right_max=height[right],water=0;
        while(left<right){
            if(left_max<right_max){
                left++;
                left_max=Math.max(left_max,height[left]);
                water = water + left_max - height[left];
            }
            else{
                right--;
                right_max=Math.max(right_max,height[right]);
                water = water + right_max - height[right];
            }
        }
        return water;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna