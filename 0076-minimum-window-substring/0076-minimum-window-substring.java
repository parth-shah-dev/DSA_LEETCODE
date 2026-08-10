import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Frequency map for target string 't'
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        // Frequency map for current sliding window in 's'
        Map<Character, Integer> sMap = new HashMap<>();

        int left = 0;
        int count = t.length(); // Tracks how many characters are still needed
        int minLen = Integer.MAX_VALUE;
        String ans = "";

        // Expand the window using the 'right' pointer
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);

            // If the character is needed and its count doesn't exceed requirements, decrement 'count'
            if (tMap.containsKey(ch) && sMap.get(ch) <= tMap.get(ch)) {
                count--;
            }

            // Shrink the window from the left as long as all characters from 't' are matched
            while (count == 0) {
                // Update answer if current window size is smaller than minLen
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    ans = s.substring(left, right + 1);
                }

                char leftChar = s.charAt(left);
                sMap.put(leftChar, sMap.get(leftChar) - 1);

                // If removing leftChar breaks the valid window condition, increment 'count'
                if (tMap.containsKey(leftChar) && sMap.get(leftChar) < tMap.get(leftChar)) {
                    count++;
                }

                left++;
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna