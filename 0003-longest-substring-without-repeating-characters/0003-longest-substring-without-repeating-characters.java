import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);

                if (set.contains(ch)) {
                    break;
                }

                set.add(ch);
                maxLen = Math.max(maxLen, j - i + 1);
            }
        }

        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna