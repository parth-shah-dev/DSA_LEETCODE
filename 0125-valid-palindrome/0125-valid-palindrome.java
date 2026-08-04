
        class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            // Move left pointer forward if character is not alphanumeric
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            // Move right pointer backward if character is not alphanumeric
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            // Compare characters after converting to lowercase
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna