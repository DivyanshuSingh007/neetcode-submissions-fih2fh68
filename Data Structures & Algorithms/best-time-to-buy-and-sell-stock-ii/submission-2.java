class Solution {
    private int helper(int[] prices, int i, int stock,int[][] dp){
        if(i == prices.length) return 0;
        if(dp[i][stock] != -1) return dp[i][stock];
        int buy = 0, sell = 0;
        if(stock == 0) buy = -prices[i] + helper(prices, i + 1, 1, dp);
        if(stock == 1) sell = prices[i] + helper(prices, i + 1, 0, dp);
        int ignore = helper(prices, i + 1, stock, dp);
        int prof = buy + sell;
        return dp[i][stock] = Math.max(prof, ignore);
    }
    public int maxProfit(int[] prices) {
        int max = -1, min = 100000009;
        int sum = 0;
        for(int num : prices){
            max = Math.max(max, num);
            min = Math.min(min, num);
            sum += num;
        }
        int[][] dp = new int[prices.length + 1][2];
            for(int j = 0; j <= prices.length; j++){
                Arrays.fill(dp[j], -1);
            }
        return helper(prices, 0, 0,dp);
    }
}