// 41. First Missing Positive
// Given an unsorted integer array nums, return the smallest missing positive integer.
// You must implement an algorithm that runs in O(n) time and uses constant extra space.

class Solution {
    public int firstMissingPositive(int[] nums) {
        return missing(nums);
    }
    public int missing(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            while (A[i] != i + 1) {
                if (A[i] <= 0 || A[i] >= n)
                    break;
                if(A[i]==A[A[i]-1])
                    break;
                int temp = A[i];
                A[i] = A[temp - 1];
                A[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++){
            if (A[i] != i + 1){
                return i + 1;
            }
        }
        return n + 1;
    }
}
