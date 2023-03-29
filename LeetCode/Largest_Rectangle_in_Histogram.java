// 84. Largest Rectangle in Histogram
// Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, 
// return the area of the largest rectangle in the histogram.

class Solution {
    public int largestRectangleArea(int[] heights) {
        return LargestRectangle(heights);
    }
    public static int LargestRectangle(int[] arr) {
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int x = st.pop();
                if (st.isEmpty()) {
                    ans = Math.max(ans, arr[x] * i);
                } else {
                    ans = Math.max(ans, arr[x] * (i - st.peek() - 1));
                }
            }
            st.push(i);
        }
        int i = arr.length;
        while (!st.isEmpty()) {
            int x = st.pop();
            if (st.isEmpty()) {
                ans = Math.max(ans, arr[x] * i);
            } else {
                ans = Math.max(ans, arr[x] * (i - st.peek() - 1));
            }
        }
        return ans;
    }
}
