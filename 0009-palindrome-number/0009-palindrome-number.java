class Solution {
    public boolean isPalindrome(int n) {
        int s=0,r=0;
        int x=n;
        while(n>0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==x){
            return true;
        }
        return false;
    }
}