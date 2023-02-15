// 37. Sudoku Solver
// Write a program to solve a Sudoku puzzle by filling the empty cells.
// A sudoku solution must satisfy all of the following rules:
// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
// The '.' character indicates empty cells.
class Solution {
    public void solveSudoku(char[][] board) {
        char[][] board2 = new char[board.length][board[0].length];
        solver(board, 0, 0, board2);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = board2[i][j];
            }
        }
    }

    public static void display(char[][] board, char[][] board2) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board2[i][j] = board[i][j];
            }
        }
    }

    public static void solver(char[][] board, int row, int col, char[][] board2) {
        if (col >= board[0].length) {
            row++;
            col = 0;
        }
        if (row >= board.length) {
            display(board, board2);
            return;
        }
        if (board[row][col] != '.') {
            solver(board, row, col + 1, board2);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isSafe(board, row, col, val)) {
                    board[row][col] = (char) (val + 48);
                    solver(board, row, col + 1, board2);
                    board[row][col] = '.';
                }
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col, int val) {
        // for row
        for (int c = 0; c < board.length; c++) {
            if (board[row][c] == (char) (val + 48)) {
                return false;
            }
        }
        // for column
        for (int r = 0; r < board.length; r++) {
            if (board[r][col] == (char) (val + 48)) {
                return false;
            }
        }
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == (char) (val + 48)) {
                    return false;
                }
            }
        }
        return true;
    }

}
