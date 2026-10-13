class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if (exp < 0) {
            exp = -exp;
        }

        double result = power(x, exp, 1.0);

        return (n < 0) ? (1.0 / result) : result;
    }

    private double power(double x, long n, double ans) {
        if (n == 0) {
            return ans;
        }
        if (n % 2 != 0) {
            ans *= x;
        }
        return power(x * x, n / 2, ans);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna