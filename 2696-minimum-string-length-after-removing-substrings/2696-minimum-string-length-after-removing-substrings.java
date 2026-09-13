class Solution {
    public int minLength(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray()){
            
            if(!stack.isEmpty() && ( (stack.peek()=='A' && ch=='B') || (stack.peek()=='C' && ch=='D') ) ){
            count--;
             stack.pop();
            }
            
            else{
                count++;
                stack.push(ch);
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna