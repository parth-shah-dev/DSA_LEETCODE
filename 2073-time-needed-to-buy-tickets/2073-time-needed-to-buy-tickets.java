class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       int total=0;
       int first=tickets[k];
       for(int i=0;i<tickets.length;i++){
        if(i<=k){
            total+=Math.min(tickets[i],first);
        }else{
            total+=Math.min(tickets[i],first-1);
        }
       }
       return total;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna