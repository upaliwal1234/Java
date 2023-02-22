// 441. Arranging Coins
// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins.
// The last row of the staircase may be incomplete.
// Given the integer n, return the number of complete rows of the staircase you will build.
class Solution {
    public int arrangeCoins(int n) {
        return arrange(n);
    }
    public static int arrange(int n){
        long l = 1;
        long h = n;
        long res = 0;
        while(l<=h){
            long mid = l + (h-l)/2;
            long sum = (mid * (mid + 1)) / 2;
            if(sum>n){
                h = mid - 1;
            }
            else{
                l = mid + 1;
                res = Math.max(res, mid);
            }
        }
        return (int)res;
    }
}
