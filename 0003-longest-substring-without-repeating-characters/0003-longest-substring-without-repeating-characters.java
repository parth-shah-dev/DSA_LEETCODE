import java.util.*;

class Solution {
   public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int left = 0, maxLen = 0;

    for (int right = 0; right < s.length(); right++) {
        char ch = s.charAt(right);
        map.put(ch, map.getOrDefault(ch, 0) + 1);

        while (map.get(ch) > 1) { // shrinking
            char leftChar = s.charAt(left);
            map.put(leftChar, map.get(leftChar) - 1);
            left++;
        }

        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna