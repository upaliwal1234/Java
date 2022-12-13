// 931. Minimum Falling Path Sum
// Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.
// A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right.
// Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).

class Solution {
        public int minFallingPathSum(int[][] A) {
        int len = A.length;
        if(len == 0) return 0;
        int[][] dp = new int[len][len];
        for(int i = 0; i < len; i++){
            dp[0][i] = A[0][i];
        }
        for(int i = 1; i < len; i++){
            for(int j = 0; j < len; j++){
                dp[i][j] = Math.min(Math.min(j > 0 ? dp[i - 1][j - 1]: Integer.MAX_VALUE, j + 1 < len ? dp[i - 1][j + 1]: Integer.MAX_VALUE), dp[i - 1][j]) + A[i][j];
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++)
            res = Math.min(res, dp[len - 1][i]);
        return res;
    }

}
