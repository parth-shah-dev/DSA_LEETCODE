class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            res[i] = -1;
            int targetIdx = -1;
            
        
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    targetIdx = j;
                    break;
                }
            }
            
            for (int k = targetIdx + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    res[i] = nums2[k];
                    break;
                }
            }
        }
        
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna