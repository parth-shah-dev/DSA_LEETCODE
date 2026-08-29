class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<= nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna