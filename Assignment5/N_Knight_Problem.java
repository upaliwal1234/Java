// Take as input N, the size of a chess board. We are asked to place N number of Knights in it, so that no knight can kill other.
// a. Write a recursive function which returns the count of different distinct ways the knights can be placed across the board. Print the value returned.
// b.Write a recursive function which prints all valid configurations (void is the return type for function).
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner rubix_scanner = new Scanner(System.in);
        int number = rubix_scanner.nextInt();
        boolean[][] board = new boolean[number][number];
        System.out.print("\n" + box_selection(board, "", number, 0, 0));
    }

    public static int box_selection(boolean[][] board, String ans, int t, int x, int y) {
        if (t == 0) {
            // print(board);
            System.out.print(ans + " ");
            return 1;
        }
        if (y >= board.length) {
            y = 0;
            x++;
        }
        if (x >= board.length) {
            return 0;
        }
        int count = 0;
        if (isSafe(board, x, y)) {
            if (board[x][y] == false) {
                board[x][y] = true;
                count += box_selection(board, ans + "{" + x + "-" + y + "} ", t - 1, x, y + 1);
                board[x][y] = false;
            }
        }
        count += box_selection(board, ans, t, x, y + 1);
        return count;
    }

    public static boolean isSafe(boolean board[][], int row, int col) {
        int i = row;
        int j = col;
        // vertically up and then left
        if (i - 2 >= 0 && j - 1 >= 0) {
            if (board[i - 2][j - 1]) {
                return false;
            }
        }
        // vertically up and then right
        if (i - 2 >= 0 && j + 1 < board.length) {
            if (board[i - 2][j + 1]) {
                return false;
            }
        }
        // horizontally left and then up
        if (i - 1 >= 0 && j - 2 >= 0) {
            if (board[i - 1][j - 2]) {
                return false;
            }
        }
        // horizontally right and then up
        if (i - 1 >= 0 && j + 2 < board.length) {
            if (board[i - 1][j + 2]) {
                return false;
            }
        }
        return true;
    }
}
