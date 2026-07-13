class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        int low=0;
        int high=nums.length-1;
        int lefti=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                lefti=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        arr[0]=lefti;
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                lefti=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        arr[1]=lefti;
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna