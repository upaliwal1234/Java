public class Count_N_Queen {
    public static void main(String[] args) {
        int m = 9;
        int n = m;
        int t = m;
        boolean[][] board = new boolean[m][n];
        System.out.println(box_selection(board, t, 0));
    }

    public static int box_selection(boolean[][] board, int t, int col) {
        if (col >= t) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < t; i++) {
            if (isSafe(board, i, col)) {
                if (board[i][col] == false) {
                    board[i][col] = true;
                    count += box_selection(board, t, col + 1);
                    board[i][col] = false;
                }
            }
        }
        return count;
    }

    public static boolean isSafe(boolean board[][], int row, int col) {
        int i, j;
        // Check this row on left side
        for (i = 0; i < col; i++) {
            if (board[row][i]) {
                return false;
            }
        }
        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < board.length; i++, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

}