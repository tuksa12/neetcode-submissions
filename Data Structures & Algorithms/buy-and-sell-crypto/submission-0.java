class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int current = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int next = prices[i];
            if (next <= current) {
                current = next;
            } else {
                if (profit < (next - current)){
                    profit = next - current;
                }
            }
        }
        return profit;
    }
}
