import java.util.ArrayList;
import java.util.List;

class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        int maxFreq = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = ++freq[c];
            if (count > maxFreq) {
                maxFreq = count;
            }
        }

        @SuppressWarnings("unchecked")
        List<Character>[] buckets = new List[maxFreq + 1];
        for (int c = 0; c < 128; c++) {
            int f = freq[c];
            if (f > 0) {
                if (buckets[f] == null) {
                    buckets[f] = new ArrayList<>();
                }
                buckets[f].add((char) c);
            }
        }

        StringBuilder sb = new StringBuilder(s.length());
        for (int f = maxFreq; f >= 1; f--) {
            List<Character> bucket = buckets[f];
            if (bucket != null) {
                for (char c : bucket) {
                    for (int k = 0; k < f; k++) {
                        sb.append(c);
                    }
                }
            }
        }

        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna