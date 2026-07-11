class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int firstlen=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                firstlen++;
            }
            if(s.charAt(i) != ' ' && firstlen!=0){
               count++;
            }
            else{
                if(firstlen==0){
                    continue;
                }else{
                    break;
                }
                
            }
            
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna