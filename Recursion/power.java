import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println(power(a, b));
        System.out.println(power(a, b, 1));
    }

    // head recursion
    // public static int power(int a, int b) {
    // if (b == 0) {
    // return 1;
    // }
    // return a * power(a, b - 1);
    // }

    // tail recursion
    public static int power(int a, int b, int ans) {
        if (b == 0) {
            return ans;
        }
        return power(a, b - 1, ans * a);
    }
}
