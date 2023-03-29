// 85. Maximal Rectangle
// Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(matrix[i][j] == '1'){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
        return MaximumRectangle(arr);
    }
    public static int MaximumRectangle(int[][] matrix) {
        int len = matrix.length;
        int[] arr = new int[matrix[0].length];
        arr = matrix[len - 1];
        int ans = LargestRectangle(arr);
        for (int i = len - 2; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (matrix[i][j] == 1) {
                    arr[j] = arr[j] + 1;
                } else {
                    arr[j] = 0;
                }
            }
            ans = Math.max(ans, LargestRectangle(arr));
        }
        return ans;
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
