class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int i=0;
        if(nums.length!=1){
            int j=1;
            while(j<nums.length){
                if(nums[i]==val && nums[j]!=val){
                    nums[i]+=nums[j];
                    nums[j]=nums[i]-nums[j];
                    nums[i]-=nums[j];
                }
                if(nums[i]!=val){
                    i++;
                }
                j++;
            }
        }
        if(nums[i]==val){
            return i;
        }
        return i+1;
    }
}
