// 896. Monotonic Array
// An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Given an integer array nums, return true if the given array is monotonic, or false otherwise.
class Solution {
    public boolean isMonotonic(int[] nums) {
        return Monotonic(nums);
    }
    public static boolean Monotonic(int[] arr){
        boolean a = true;
        boolean b = true;
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                a = false;
                break;
            }
        }
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]<arr[i]){
                b = false;
                break;
            }
        }
        if(a || b){
            return true;
        }
        return false;
    }
}
