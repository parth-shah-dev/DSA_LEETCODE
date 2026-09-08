class Solution {
    public int calculate(String s) {
        int length = s.length();
        int sign = 1;
        int ans = 0;
        int currno = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                currno = ch - '0';
                while (i + 1 < length && Character.isDigit(s.charAt(i + 1))) {
                    currno = currno * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                ans += currno * sign;
                currno = 0;
            } else if (ch == '+') {
                sign = 1;
            } else if (ch == '-') {
                sign = -1;
            } else if (ch == '(') {
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1; 
            } else if (ch == ')') {
                int prevsign = stack.pop();
                int prevans = stack.pop();
                ans = prevans + (prevsign * ans);
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna