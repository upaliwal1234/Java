// 1539. Kth Missing Positive Number
// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
// Return the kth positive integer that is missing from this array.

class Solution {
    public int findKthPositive(int[] arr, int k) {
        return kthmissing(arr,k);
    }
    public static int kthmissing(int[] arr, int k){
        int l = 0;
        int r = arr.length-1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if (arr[mid]-mid-1 < k)
                l = mid+1;
            else
                r = mid-1;
            }
        return l + k;
    }
}
