class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        // Find the upper bound (maximum value in piles)
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        int result = high;
        
        // Binary search for the minimum viable speed
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canEatAll(piles, mid, h)) {
                result = mid;       
                high = mid - 1;
            } else {
                low = mid + 1;      
            }
        }
        
        return result;
    }
    
    private boolean canEatAll(int[] piles, int speed, int h) {
        long totalHours = 0;
        
        for (int pile : piles) {

            totalHours += (pile + speed - 1) / speed;
            

            if (totalHours > h) {
                return false;
            }
        }
        
        return totalHours <= h;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna