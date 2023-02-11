// 51. N-Queens
// The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
// Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
// Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list = new ArrayList<List<String>>();
        if(n == 1){
            List<String> l = new ArrayList<>();
            l.add("Q");
            list.add(new ArrayList<>(l));
            return list;
        }
        boolean[][] board = new boolean[n][n];
        box_selection(n, n, n, 0, 0, board, list);
        return list;
    }

    public static void box_selection(int m, int n, int t, int x, int y, boolean[][] board, List<List<String>> list) {
        if (y == n) {
            x++;
            y = 0;
        }
        if (t == 0) {
            List<String> l = print(board);
            list.add(new ArrayList<>(l));
            return;
        }
        if (x == m) {
            return;
        }
        if (isSafe(x, y, board)) {
            board[x][y] = true;
            box_selection(m, n, t - 1, x, y + 1, board, list);
            board[x][y] = false;
        }
        box_selection(m, n, t, x, y + 1, board, list);
    }

    public static List<String> print(boolean[][] board) {
        List<String> l = new ArrayList<String>();
        for (int i = 0; i < board.length; i++) {
            String str = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == true) {
                    str += 'Q';
                } 
                else {
                    str += '.';
                }
            }
            l.add(str);
        }
        return l;
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
