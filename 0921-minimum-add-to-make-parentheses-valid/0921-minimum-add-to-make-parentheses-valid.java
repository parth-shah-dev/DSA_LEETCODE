class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int closing=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    closing++;
                }
            }
        }
        return stack.size()+closing;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna