import java.util.*;

public class Agressive_Cows {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int C = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = LargestMinimum(C, arr);
            System.out.println(ans);
        }
    }

    public static int LargestMinimum(int C, int[] arr) {
        int ans = 0;
        int l = arr[0];
        int h = arr[arr.length - 1];
        Arrays.sort(arr);
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isPosibble(arr, mid, C)) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isPosibble(int[] arr, int min, int C) {
        int last = arr[0];
        C--;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= min) {
                C--;
                last = arr[i];
            }
            if (C == 0) {
                return true;
            }
        }
        return false;
    }
}
