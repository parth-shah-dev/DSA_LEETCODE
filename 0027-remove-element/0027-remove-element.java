class Solution {
    public int removeElement(int[] n, int v) {
        int g=0;
        for(int i=0;i<n.length;i++){
            if(n[i]!=v){
                n[g]=n[i];
                g++;
            }
        }
        return g;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna