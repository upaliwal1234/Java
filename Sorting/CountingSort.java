import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 0, 1, 2, 5, 4, 0, 2, 8, 7, 9, 2, 6, 1, 9 };
        arr = Sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] Sort(int[] arr) {
        // int max = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        int max = Arrays.stream(arr).max().getAsInt();
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i < freq.length; i++) {
            freq[i] = freq[i - 1] + freq[i];
        }

        int[] ans = new int[arr.length];
        for (int i = ans.length - 1; i >= 0; i--) {
            int c = freq[arr[i]] - 1;
            ans[c] = arr[i];
            freq[arr[i]]--;
        }
        return ans;
    }
}
