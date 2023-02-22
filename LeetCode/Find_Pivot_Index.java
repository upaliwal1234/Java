// 724. Find Pivot Index
// Given an array of integers nums, calculate the pivot index of this array.
// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
// Return the leftmost pivot index. If no such index exists, return -1.
class Solution {
    public int pivotIndex(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i = 1; i<nums.length; i++){
            left[i] = left[i-1]+nums[i-1];
        }
        for(int i = nums.length-2; i>=0; i--){
            right[i] = right[i+1] + nums[i+1];
        }
        for(int i = 0; i<nums.length; i++){
            if(left[i] == right[i]){
                return i;
            }
        }
        return -1;
    }
}
