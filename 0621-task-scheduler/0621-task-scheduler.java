class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int maxFreq = 0;

        for (char task : tasks) {
            int idx = task - 'A';
            freq[idx]++;
            if (freq[idx] > maxFreq) {
                maxFreq = freq[idx];
            }
        }

        int maxCount = 0;
        for (int count : freq) {
            if (count == maxFreq) {
                maxCount++;
            }
        }

        int intervals = (maxFreq - 1) * (n + 1) + maxCount;
        return Math.max(tasks.length, intervals);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna