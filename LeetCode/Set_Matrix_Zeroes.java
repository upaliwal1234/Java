// 73. Set Matrix Zeroes
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] zeroRow = new boolean[matrix.length];
        boolean[] zeroColumn = new boolean[matrix[0].length];
        for (int i = 0 ; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    zeroRow[i] = true;
                    zeroColumn[j] = true;
                }
            }
        }
        for (int i = 0 ; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(zeroRow[i] || zeroColumn[j]){
                    matrix[i][j] =0;
                }
            }
        }
    }
}
