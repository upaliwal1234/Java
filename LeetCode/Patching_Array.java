// 330. Patching Array
// Hard
// Given a sorted integer array nums and an integer n, 
// add/patch elements to the array such that any number in the range [1, n] inclusive can be formed by the sum of some elements in the array.
// Return the minimum number of patches required.
class Solution {
    public int minPatches(int[] nums, int n) {
        int count = 0;
        long missing = 1;
        int i = 0;
        while (missing <= n ) {
            if (i < nums.length && missing >= nums[i]) {
                missing += nums[i];
                i++;
            } else {
                missing += missing;
                count++;
            }
        }
        return count;
    }
}
