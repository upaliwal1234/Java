// 309. Best Time to Buy and Sell Stock with Cooldown
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times)
//   with the following restrictions:
// After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
// Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
class Solution {
    public int maxProfit(int[] prices) {
        return Profit(prices);
    }
    public static int Profit(int[] prices){
        int n = prices.length;
        if(n<=1)
            return 0;
        int buy = -prices[0];
        int sell = 0;
        int cooldown = 0; 
        for(int i=1;i<n;i++)
        {
            int pre_buy = buy, pre_sell = sell;
            int pre_cooldown = cooldown;
            buy = Math.max(pre_buy, pre_cooldown-prices[i]);
            sell = Math.max(pre_sell, prices[i]+pre_buy);
            cooldown = Math.max(pre_cooldown,pre_sell);
        }
        return Math.max(sell,cooldown);

    }
}
