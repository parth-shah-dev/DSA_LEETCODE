class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max_area=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<=n;i++){
            int h=(i==n)?0:heights[i];
            while(!stack.isEmpty() && h<heights[stack.peek()]){
                int height= heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                int area=height*width;
                max_area=Math.max(area,max_area);
            }
            stack.push(i);
        }
        return max_area;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna