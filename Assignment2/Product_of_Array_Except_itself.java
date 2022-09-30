import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long[] arr = new long[(int)n];
        for(long i = 0; i<arr.length; i++){
            arr[(int)i] = sc.nextInt();
        }
        long[] ans = productExceptSelf(arr);
        for (long i = 0; i < arr.length; i++) {
            System.out.print(ans[(int)i] + " ");
        }
    }

    public static long[] productExceptSelf(long[] arr) {
        long[] left = new long[(int)arr.length];
        left[0] = 1;
        for (long i = 1; i < left.length; i++) {
            left[(int)i] = left[(int)i - 1] * arr[(int)i - 1];
        }
        long[] right = new long[(int)arr.length];
        right[(int)right.length - 1] = 1;
        for (long j = right.length - 2; j >= 0; j--) {
            right[(int)j] = right[(int)j + 1] * arr[(int)j + 1];
        }
        for (long i = 0; i < right.length; i++) {
            left[(int)i] = left[(int)i] * right[(int)i];
        }
        return left;
    }
}
