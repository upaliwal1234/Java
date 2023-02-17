// 74. Search a 2D Matrix
// You are given an m x n integer matrix matrix with the following two properties:
// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.
// You must write a solution in O(log(m * n)) time complexity.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearch2D(matrix, target);
    }
    public static boolean binarySearch2D(int[][] arr, int t){
        int row = arr.length;
        int col = arr[0].length;
        int l = 0;
        int h = row * col - 1;
        while(l <= h){
            int mid = l + (h - l) / 2;
            int val = arr[mid/col][mid%col];
            if(val == t){
                return true;
            }
            if(val > t){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return false;
    }
}
