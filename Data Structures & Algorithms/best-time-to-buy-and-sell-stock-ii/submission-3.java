class Solution {
    public int maxProfit(int[] prices) {
        int[] curr = new int[2];
        int[] next = new int[2];

       next[0] = 0; next[1] = 0;

       for(int i = prices.length - 1; i >= 0; i--){
            for(int j = 1; j >= 0; j--){
                int buy = 0, sell = 0;
                if(j == 0) buy = -prices[i] + next[1];
                if(j == 1) sell = prices[i] + next[0];
                int ignore = next[j];
                int prof = buy + sell;
                curr[j] = Math.max(prof, ignore);
            }
            next = curr.clone();
       }
       return next[0];
    }
}