// Program for Permutations of H and T if a coin is tossed n times and no two H are appeared together.
public class toss_without_HH {
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
        int a = 0;
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
            a = toss(n - 1, ans + "H");
        }
        int b = toss(n - 1, ans + "T");
        return a + b;
    }
}