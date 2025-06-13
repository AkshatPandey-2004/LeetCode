class Solution {
    public int singleNumber(int[] nums) {
        int num1 = 0;
        for (int num2 : nums) {
            num1 = num1 ^ num2;
        }
        return num1;
    }
}
