public class Tower_of_Hanoi {
    public static void main(String[] args) {
        int n = 4;
        hanoi(n, "A", "C", "B");
    }

    public static void hanoi(int n, String src, String hlp, String des) {
        if (n == 0) {
            return;
        }
        hanoi(n - 1, src, des, hlp);
        System.out.println("Moving ring " + n + " from " + src + " to " + des);
        hanoi(n - 1, hlp, src, des);
    }
}