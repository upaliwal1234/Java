import java.util.Scanner;

public class factorial_tail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n, 1));
    }

    public static int fact(int n, int ans) {
        if (n == 0) {
            return ans;
        }
        return fact(n - 1, ans * n);
    }
}
