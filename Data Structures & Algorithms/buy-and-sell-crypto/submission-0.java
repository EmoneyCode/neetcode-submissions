class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int low = prices[0];
        for(int i = 0; i<prices.length; i++){
            low = Math.min(prices[i],low);
            max = Math.max(max,prices[i]-low);
        }
        return max;
    }
}
