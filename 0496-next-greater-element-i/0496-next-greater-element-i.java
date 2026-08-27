class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int target=-1;
            int count=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) count++;
                if(nums2[j]>nums1[i] && count>0){
                    target=nums2[j];
                    break;
                }
            }
            res[i]=target;
         }
    
            return res;
        
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna