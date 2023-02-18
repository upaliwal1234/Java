// 35. Search Insert Positions
// Given a sorted array of distinct integers and a target value, return the index if the target is found. 
//   If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.
class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums, target);
    }
    public static int search(int[] arr, int t){
        int l = 0;
        int h = arr.length - 1;
        int mid = 0;
        while(l <= h){
            mid = l + (h - l) / 2;
            if(arr[mid] == t){
                return mid;
            }
            if(arr[mid] < t){
                l = mid + 1;
            }
            else if(arr[mid] > t){
                h = mid - 1;
            }
        }
        return l + (h-l)/2;
    }
}
