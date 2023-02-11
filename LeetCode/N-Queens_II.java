// 52. N-Queens II
// The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
// Given an integer n, return the number of distinct solutions to the n-queens puzzle.
class Solution {
    public int totalNQueens(int n) {
        if(n == 1){
            return 1;
        }
        boolean[][] board = new boolean[n][n];
        return box_selection(n, n, n, 0, 0, board);
    }

    public static int box_selection(int m, int n, int t, int x, int y, boolean[][] board) {
        if (y == n) {
            x++;
            y = 0;
        }
        if (t == 0) {
            return 1;
        }
        if (x == m) {
            return 0;
        }
        int count = 0;
        if (isSafe(x, y, board)) {
            board[x][y] = true;
            count += box_selection(m, n, t - 1, x, y + 1, board);
            board[x][y] = false;
        }
        count += box_selection(m, n, t, x, y + 1, board);
        return count;
    }

    public static boolean isSafe(int r, int c, boolean[][] board) {
        for (int row = r; row >= 0; row--) {
            if (board[row][c]) {
                return false;
            }
        }
        for (int col = 0; col < c; col++) {
            if (board[r][col]) {
                return false;
            }
        }
        int r1 = r;
        int c1 = c;
        while (r1 >= 0 && c1 >= 0) {
            if (board[r1][c1]) {
                return false;
            }
            r1--;
            c1--;
        }
        int r2 = r;
        int c2 = c;
        while (r2 >= 0 && c2 < board[0].length) {
            if (board[r2][c2]) {
                return false;
            }
            r2--;
            c2++;
        }
        return true;
    }
}
