// 790. Domino and Tromino Tiling
// You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.
// Given an integer n, return the number of ways to tile an 2 x n board. Since the answer may be very large, return it modulo 109 + 7.
// In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board
// such that exactly one of the tilings has both squares occupied by a tile.
class Solution {
    public int numTilings(int n) {
        return num_Tilings(n);
    }
    public static int num_Tilings(int N){
        long MOD = 1000000007l;
        if (N < 3){
            return N;
        }
        long[][] dp = new long[N + 1][3];
        for(long[] row : dp){
            Arrays.fill(row, 0);
        }
        dp[0][0] = dp[1][0] = 1;
        dp[1][1] = dp[1][2] = 1;
        for(int i = 2; i <= N; i++){
            dp[i][0] = (dp[i - 1][0] + dp[i - 2][0] + dp[i - 2][1] + dp[i - 2][2]) % MOD;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % MOD;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
        }
        return (int)dp[N][0]%((int)Math.pow(10,9)+7);
    }
}
