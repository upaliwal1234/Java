//Question 240 LeetCode
//function
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                ans = true;
                break;
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return ans;
        
    }
    
}
