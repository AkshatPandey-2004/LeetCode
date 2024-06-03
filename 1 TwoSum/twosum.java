class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output= new int[2];
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                output[0]=hs.get(nums[i]);
                output[1]=i;
                break;
            }
            hs.put(target-nums[i],i);
        }
        return output; 
    }
}
