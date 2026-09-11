class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> stack=new Stack<>();
       int count=0;
       for(char ch:s.toCharArray()){
        if(!stack.isEmpty()){
            if(ch==stack.peek()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        else if(count==0) {
            stack.push(ch);
        }
       }
       StringBuilder str=new StringBuilder();
       for(char c:stack){
        str.append(c);
       }
       return str.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna