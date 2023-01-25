public class Queen_Combination {
    public static void main(String[] args) {
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        Combination(tq, board, 0, "", 0);
    }

    public static void Combination(int tq, boolean[] board, int qpsf, String ans, int last) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = last; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                Combination(tq, board, qpsf + 1, ans + "b" + i + "q" + qpsf, i + 1);
                board[i] = false;
            }
        }
    }
}
