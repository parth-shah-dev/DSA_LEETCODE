class Solution {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) return false;

        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack[++top] = ')';
            } else if (ch == '{') {
                stack[++top] = '}';
            } else if (ch == '[') {
                stack[++top] = ']';
            } else {

                if (top == -1 || stack[top--] != ch) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna