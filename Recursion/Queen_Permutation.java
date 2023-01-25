public class Queen_Permutation {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        Permutation(tq, board, 0, "");
    }

    public static void Permutation(int tq, boolean[] board, int qpsf, String ans) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                Permutation(tq, board, qpsf + 1, ans + "b" + i + "q" + qpsf);
                board[i] = false;
            }
        }
    }
}