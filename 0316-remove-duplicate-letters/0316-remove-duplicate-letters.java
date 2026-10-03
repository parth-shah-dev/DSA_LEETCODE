class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastindex = new int[26];
        boolean[] visited = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            lastindex[s.charAt(i) - 'a'] = i;
        }

        StringBuilder stack = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (visited[ch - 'a']) {
                continue;
            }

        
            while (!stack.isEmpty() 
                   && stack.charAt(stack.length() - 1) > ch 
                   && lastindex[stack.charAt(stack.length() - 1) - 'a'] > i) {
                visited[stack.charAt(stack.length() - 1) - 'a'] = false;
                stack.deleteCharAt(stack.length() - 1);
            }

            stack.append(ch);
            visited[ch - 'a'] = true;
        }

        return stack.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna