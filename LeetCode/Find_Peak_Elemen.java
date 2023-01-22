// 162. Find Peak Element
// A peak element is an element that is strictly greater than its neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
// You must write an algorithm that runs in O(log n) time.
class Solution {
    public int findPeakElement(int[] nums) {
        int peak = 0;
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            int mid = i + (j - i) / 2;
            if(nums[mid] < nums[mid+1]){
                i = peak = mid + 1;
            }
            else{
                j = mid;
            }
        }
        return peak;
    }
}
