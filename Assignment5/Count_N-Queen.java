// You are given an empty chess board of size N*N.
// Find the number of ways to place N queens on the board, such that no two queens can kill each other in one move.
// A queen can move vertically, horizontally and diagonally.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner rubix_scan = new Scanner(System.in);
        int number = rubix_scan.nextInt();

        if(number == 1){
            System.out.print(1);
            return;
        }
        boolean[][] board = new boolean[number][number];
        System.out.print(box_selection(board, number, 0));
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
