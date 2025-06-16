class Solution {
    public int missingNumber(int[] nums) {
        int arr_sum=0,actual_sum=nums.length;
        for(int i=0;i<nums.length;i++){
            arr_sum+=nums[i];
            actual_sum+=i;
        }
        return actual_sum-arr_sum;
    }
}