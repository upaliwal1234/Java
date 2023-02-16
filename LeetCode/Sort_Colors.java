// 75. Sort Colors
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
// with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.
class Solution {
    public void sortColors(int[] nums) {
        sort(nums);
    }
    public static void sort(int[] arr) {
        int l = 0;
        int mid = 0;
        int h = arr.length - 1;
        while (mid <= h) {
            if (arr[mid] == 2) {
                swap(arr, mid, h);
                h--;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, l, mid);
                l++;
                mid++;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
