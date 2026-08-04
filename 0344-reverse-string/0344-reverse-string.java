class Solution {
    public void reverseString(char[] s) {
        int k=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[k];
            s[k]=temp;
            k--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna