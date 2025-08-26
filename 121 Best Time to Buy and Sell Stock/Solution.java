class Solution {
    public int maxProfit(int[] prices) {
        int cur = prices[0], max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (cur > prices[i]) {
                cur = prices[i];
            }
            max = Math.max(max, prices[i] - cur);
        }
        return max;
    }
}
