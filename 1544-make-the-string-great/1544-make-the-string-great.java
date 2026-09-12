class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && Math.abs(ch-stack.peek())==32){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder st=new StringBuilder();
        for(char c:stack){
            st.append(c);
        }
        return st.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna