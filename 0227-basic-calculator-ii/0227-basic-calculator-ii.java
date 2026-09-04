import java.util.Stack;

class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char op = '+';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // Process operator on reaching a non-space symbol or the end of the string
            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
                if (op == '+') {
                    stack.push(num);
                } else if (op == '-') {
                    stack.push(-num);
                } else if (op == '*') {
                    stack.push(stack.pop() * num);
                } else if (op == '/') {
                    stack.push(stack.pop() / num);
                }
                op = ch;
                num = 0;
            }
        }

        int answer = 0;
        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        return answer;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna