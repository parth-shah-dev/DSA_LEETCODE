class Solution {
    public int maxArea(int[] height) {
        int maxval=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int width=j-i;
            int area=h*width;
            maxval=Math.max(area,maxval);
            if(height[i]<=height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxval;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna