class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int i,j;
        int[] output=new int[nums.length];
        // //Bubble Sort
        // for(i=0;i<nums.length-1;i++){
        //     for(j=i+1;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }

        // for(i=0;i<nums.length;i++){
        //     output[i]=i;
        //     while(nums[i]==nums[i+1] && i<nums.length-1){
        //         i++;
        //         output[i]=i;
        //     }
        // }
        
        for(i=0;i<nums.length;i++){
            int count=0;
            for(j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            output[i]=count;
        }

        return output;

    }
}
