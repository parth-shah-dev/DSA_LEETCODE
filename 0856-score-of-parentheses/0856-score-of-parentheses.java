class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        int score=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            else{
                count--;
                if(s.charAt(i-1)=='('){
                    score+=1<<count;
                }
            }
        }
        return score;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna