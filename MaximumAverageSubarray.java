class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1){
            return nums[0];
        }
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double gavg=sum/k;
        for(int i=k;i<nums.length;i++){
            sum=(sum-nums[i-k])+nums[i];
            double cavg=sum/k;
            if(cavg>gavg){
                gavg=cavg;
            }
        }
        return gavg;
    }
}
