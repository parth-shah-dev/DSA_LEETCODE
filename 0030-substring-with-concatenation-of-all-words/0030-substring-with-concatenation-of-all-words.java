import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;
        
        // Return early if the string is shorter than the combined length of all words
        if (s.length() < totalLen) {
            return result;
        }

        // Build the frequency map for the target words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Run the sliding window from different offsets to cover all alignments
        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int right = i;
            int matchedWordsCount = 0;
            Map<String, Integer> currentMap = new HashMap<>();

            // Move the right pointer in chunks of wordLen
            while (right + wordLen <= s.length()) {
                // Extract the word at the right pointer
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                // Case 1: Word belongs to the original list
                if (wordMap.containsKey(word)) {
                    currentMap.put(word, currentMap.getOrDefault(word, 0) + 1);
                    matchedWordsCount++;

                    // If we have more instances of 'word' than expected, shrink window from left
                    while (currentMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        currentMap.put(leftWord, currentMap.get(leftWord) - 1);
                        matchedWordsCount--;
                        left += wordLen;
                    }

                    // If all words are matched perfectly, add the start index to results
                    if (matchedWordsCount == wordCount) {
                        result.add(left);
                    }
                } 
                // Case 2: Word is invalid, reset the window entirely
                else {
                    currentMap.clear();
                    matchedWordsCount = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna