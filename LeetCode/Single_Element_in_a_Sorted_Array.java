// 540. Single Element in a Sorted Array
// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
// Return the single element that appears only once.
// Your solution must run in O(log n) time and O(1) space.
class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int i = 0;
        int j = 2;
        while(j<nums.length){
            int mid = i + (j-i)/2;
            if(nums[mid]!= nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(j == nums.length-1 && nums[mid]!=nums[mid+1]){
                return nums[j];
            }
            i++;
            j++;
        }
        return nums[0];
    }
}
