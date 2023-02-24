// 1351. Count Negative Numbers in a Sorted Matrix
// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
class Solution {
    public int countNegatives(int[][] grid) {
        return count(grid);
    }
    public static int count(int[][] arr){
        int c = 0;
        for(int i = 0; i<arr.length; i++){
            int l = 0;
            int h = arr[i].length - 1;
            while(l <= h){
                int mid = l + (h-l)/2;
                if(arr[i][mid] < 0){
                    h--;
                    c++;
                }
                else if(arr[i][mid] >= 0){
                    l = mid + 1;
                }
                else{
                    h--;
                }
            }
        }
        return c;
    }
}
