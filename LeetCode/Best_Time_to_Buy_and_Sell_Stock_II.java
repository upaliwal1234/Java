// 122. Best Time to Buy and Sell Stock II
// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
// However, you can buy it then immediately sell it on the same day.
// Find and return the maximum profit you can achieve.
class Solution {
    public int maxProfit(int[] prices) {
        return max(prices);
    }
    public static int max(int[] arr){
        if(arr.length<=1){
            return 0;
        }
        int ans = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                ans+= arr[i] - arr[i-1];
            }
        }
        return ans;
    }
}
