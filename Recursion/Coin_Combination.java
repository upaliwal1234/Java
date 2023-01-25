public class Coin_Combination {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = { 2, 3, 5 };
        Combination(n, arr, "", 0, 0);
    }

    public static void Combination(int n, int[] arr, String ans, int sum, int last) {
        if (sum == n) {
            System.out.println(ans);
            return;
        }
        if (sum > n) {
            return;
        }
        for (int i = last; i < arr.length; i++) {
            Combination(n, arr, ans + arr[i], sum + arr[i], last + i);
        }
    }
}
