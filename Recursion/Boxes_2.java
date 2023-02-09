public class Boxes_2 {
    public static void main(String[] args) {
        int n = 4;
        int t = 2;
        box_selection(n, t, "", 0);
    }

    public static void box_selection(int n, int t, String ans, int lst) {
        if (lst > n) {
            return;
        }
        if (ans.length() == 2 * t) {
            System.out.println(ans);
            return;
        }
        box_selection(n, t, ans + "B" + lst, lst + 1);
        box_selection(n, t, ans, lst + 1);
    }
}