public class Sliding_Window_FixedSize {
    public static void main(String[] args) {

        int[] arr = { 1, 4, 5, 6, 7, 8, 2, 3, 9, 1, 2, 5 };
        int k = 3;
        int ans = Sliding_Window(arr, k);
        System.out.println(ans);

    }

    public static int Sliding_Window(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        max = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i]; // Window size increase
            sum = sum - arr[i - k]; // Window size decrease
            max = Math.max(max, sum);
        }
        return max;
    }
}
