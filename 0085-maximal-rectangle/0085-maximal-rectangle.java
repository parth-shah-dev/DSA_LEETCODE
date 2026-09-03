class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[] heights=new int[cols];
        int maxarea=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]=='1'){
                    heights[j]+=1;
                }else{
                    heights[j]=0;
                }
            }
            maxarea=Math.max(maxarea,largestrec(heights));
        }
       return maxarea;
    }
    private int largestrec(int[] heights){
        int n=heights.length;
        int maxarea=0;
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<=n;i++){
            int h=(n==i)?0:heights[i];
            while(!stack.isEmpty() && h<heights[stack.peek()]){
                int height=heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                int area=height*width;
                maxarea=Math.max(maxarea,area);
            }
            stack.push(i);
        }
        return maxarea;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna