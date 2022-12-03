// 704. Binary Search
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
// If target exists, then return its index. Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.

class Solution {
    public int search(int[] nums, int target) {
        return binary_search(nums,target);
    }
    public static int binary_search(int[] arr, int t){
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]>t){
                h = mid-1;
            }
            else if(arr[mid]<t){
                l = mid+1;
            }
        }
        return -1;
    }
}
