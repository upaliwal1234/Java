// LeetCode Ques. 713 SubArray Product less than k.
public class SubArray_Product_Less_Than_K {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 6 };
        int k = 100;
        System.out.println(SubArray(arr, k));
    }

    public static int SubArray(int[] arr, int k) {
        int count = 0;
        int si = 0;
        int ei = 0;
        int p = 1;
        while (ei < arr.length) {
            // grow
            p *= arr[ei];
            // shrink
            while (p >= k && si <= ei) {
                p /= arr[si];
                si++;
            }
            // ans calculate
            count = count + (ei - si + 1);
            ei++;
        }
        return count;
    }
}
