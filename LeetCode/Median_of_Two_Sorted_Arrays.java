// 4. Median of Two Sorted Arrays
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return median(nums1,nums2);
    }
    public static double median(int[] arr1, int[] arr2){
        double ans = 0;
        int[] arr  = new int[arr1.length+arr2.length];
        for(int i = 0; i<arr1.length;i++){
            arr[i] = arr1[i];
        }
        for(int i = arr1.length;i<arr.length;i++){
            arr[i] = arr2[i-arr1.length];
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            ans = (double) arr[arr.length/2];
        }
        else{
            ans = (double)(arr[(arr.length/2)-1]+arr[arr.length/2])/2;
        }

        return ans;
    }
}
