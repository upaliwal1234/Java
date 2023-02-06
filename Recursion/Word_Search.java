
// 79. Word Search
// Given an m x n grid of characters board and a string word, return true if word exists in the grid.
// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. 
// The same letter cell may not be used more than once.
public class Word_Search {
    public static void main(String[] args) {
        char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        String word = "ABCCED";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean ans = word_search(board, word, i, j, 0);
                    if (ans) {
                        System.out.println(ans);
                        return;
                    }
                }

            }
        }
        System.out.println(false);
    }

    public static boolean word_search(char[][] board, String word, int cr, int cc, int x) {
        if (x == word.length()) {
            return true;
        }
        if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || board[cr][cc] != word.charAt(x)) {
            return false;
        }

        int[] r = { -1, 1, 0, 0 };
        int[] c = { 0, 0, -1, 1 };
        board[cr][cc] = '*';
        boolean ans = false;
        for (int i = 0; i < r.length; i++) {
            ans = word_search(board, word, cr + r[i], cc + c[i], x + 1);
            if (ans) {
                return ans;
            }
        }
        board[cr][cc] = word.charAt(x);
        return false;
    }

}