// 905. Sort Array By Parity
// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
// Return any array that satisfies this condition.
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int si = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2==0){
                int t = nums[i];
                nums[i] = nums[si];
                nums[si] = t;
                si++;
            }
        }
        return nums;
    }
}
