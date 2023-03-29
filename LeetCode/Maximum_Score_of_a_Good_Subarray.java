// 1793. Maximum Score of a Good Subarray
// You are given an array of integers nums (0-indexed) and an integer k.
// The score of a subarray (i, j) is defined as min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1). A good subarray is a subarray where i <= k <= j.
// Return the maximum possible score of a good subarray.
class Solution {
    public int maximumScore(int[] nums, int k) {
        return MaximumScore(nums, k);
    }
    public static int MaximumScore(int[] arr, int k) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int x = st.pop();
                int r = i;
                if (r - 1 >= k) {
                    if (st.isEmpty()) {
                        ans = Math.max(ans, arr[x] * r);
                    } else {
                        int l = st.peek();
                        if (l + 1 <= k) {
                            ans = Math.max(ans, arr[x] * (r - l - 1));
                        }
                    }
                }
            }
            st.push(i);
        }
        int r = arr.length;
        while (!st.isEmpty()) {
            int x = st.pop();
            if (r - 1 >= k) {
                if (st.isEmpty()) {
                    ans = Math.max(ans, arr[x] * r);
                } else {
                    int l = st.peek();
                    if (l + 1 <= k) {
                        ans = Math.max(ans, arr[x] * (r - l - 1));
                    }
                }
            }
        }
        return ans;
    }
}
