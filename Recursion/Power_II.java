public class Power_II {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        System.out.println(power(a, b));
    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int ans = power(a, b / 2) * power(a, b / 2);
        if (b % 2 != 0) {
            ans *= a;
        }
        return ans;
    }
}
