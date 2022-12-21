// 59. Spiral Matrix II
// Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
class Solution {
    public int[][] generateMatrix(int n) {
        return matrix(n);
    }
    public static int[][] matrix(int n){
        int [][] arr = new int[n][n];
        int minr = 0;
        int minc = 0;
        int maxr = n - 1;
        int maxc = n - 1;
        int x = 0;
        int t = n * n;
        while (x < t) {
            for (int i = minc; i <= maxc; i++) {
                arr[minr][i] = x+1;
                x++;
            }
            minr++;
            for (int i = minr; i <= maxr && x < t; i++) {
                arr[i][maxc] = x+1;
                x++;
            }
            maxc--;
            for (int i = maxc; i >= minc && x < t; i--) {
                arr[maxr][i] = x+1;
                x++;
            }
            maxr--;
            for (int i = maxr; i >= minr && x < t; i--) {
                arr[i][minc] = x+1;
                x++;
            }
            minc++;
        }
        return arr;
    }
}
