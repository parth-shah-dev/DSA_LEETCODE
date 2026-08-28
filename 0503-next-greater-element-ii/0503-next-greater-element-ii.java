class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stack=new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            int num= nums[i%n];
            while(!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }
            if(!stack.isEmpty() && i<n){
                res[i]=stack.peek();
            }
            stack.push(num);
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna