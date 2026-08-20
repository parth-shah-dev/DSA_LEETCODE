class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
    int low=0,high=(int)Math.pow(10,7);
    int ans=-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(reach(dist,hour,mid)){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return ans;
    }
    private boolean reach(int dist[],double hour,int speed){
        double time=0.0;
        for(int i=0;i<dist.length;i++){
            double t=(double)dist[i]/speed;
            if(i!=dist.length-1){
                time+=Math.ceil(t);
            }
            else{
                time+=t;
            }
        }
        return time<=hour;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna