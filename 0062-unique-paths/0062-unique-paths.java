class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return countpath(m-1,n-1,dp);
    }
    int countpath(int m,int n,int[][] dp){
        if(m==0 || n==0){
            return 1;
        }
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        dp[m][n]= countpath(m,n-1,dp)+countpath(m-1,n,dp);
        return dp[m][n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna