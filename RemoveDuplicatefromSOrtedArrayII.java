class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,count=0;
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j] && count==0){
                count++;
                i++;
                nums[i]=nums[j];
            }
            else if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                if(count==1){
                    count--;
                }
                else{
                    count=0;
                }
            }
        }
        return i+1;
    }
}
