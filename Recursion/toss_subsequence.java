public class toss_subsequence {
    public static void main(String[] args) {
        int n = 4;
        // toss(n, "");
        System.out.println("\n" + toss(n, ""));
    }

    public static int toss(int n, String ans) {
        if (n == 0) {
            System.out.print(ans + " ");
            return 1;
        }
        int a = toss(n - 1, ans + "H");
        int b = toss(n - 1, ans + "T");
        return a + b;
    }
}