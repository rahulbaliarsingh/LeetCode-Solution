class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum=0;
        double avg=0;
        double maxavg=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        avg= (double)sum/k;
        maxavg=avg;
        for(int i=1;i<=nums.length-k;i++)
        {
            sum=sum-nums[i-1]+nums[i+k-1];
            avg=(double)sum/k;
            if(avg>maxavg){
                maxavg=avg;
            }
        }
        return maxavg;
        
    }
}