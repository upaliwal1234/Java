// 121. Best Time to Buy and Sell Stock
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
class Solution {
    public int maxProfit(int[] prices) {
        return max_profit(prices);
    }
    public int max_profit(int[] prices){
        if(prices.length<=1){
            return 0;
        }
        int ans = 0;
        int min = prices[0];
        for(int i = 1; i<prices.length; i++){
            ans = Math.max(prices[i]-min, ans);
            if(prices[i]<min){
                min = prices[i];
            }
        }
        return ans;
    }
}
