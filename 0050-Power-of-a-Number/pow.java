class Solution {
    double ans = 1;
    int count = 0;

    public double myPow(double x, int n) {
        long exp = n;
        if (exp < 0 && count == 0) {
            exp = -exp;
            count = 1;
        }

        while (exp > 0) {
            if (exp % 2 == 1) {
                ans = ans * x;
            }
            x = x * x;
            exp = exp / 2;
        }

        if (count == 1) return 1 / ans;
        return ans;
    }
}