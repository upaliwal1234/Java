public class Boxes_2D {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int t = 2;
        box_selection(m, n, t, "", 0, 0);
    }

    public static void box_selection(int m, int n, int t, String ans, int x, int y) {
        if (y == n) {
            x++;
            y = 0;
        }
        if (x == m) {
            return;
        }
        if (ans.length() == 6 * t) {
            System.out.println(ans);
            return;
        }
        box_selection(m, n, t, ans + "Q{" + x + "," + y + "}", x, y + 1);
        box_selection(m, n, t, ans, x, y + 1);
    }
}