class Solution {
    public int minLength(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray()){
            
            if(!stack.isEmpty() && stack.peek()=='A' ){
               
                if(ch=='B'){
                    count--;
                    stack.pop();  
                } 
                else{
                    count++;
                    stack.push(ch);
                } 
            }
            else if(!stack.isEmpty() && stack.peek()=='C'){
                 if(ch=='D'){
                    count--;
                    stack.pop();  
                } 
                else{
                    count++;
                    stack.push(ch);
                } 
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