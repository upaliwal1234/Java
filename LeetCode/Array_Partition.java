// 561. Array Partition
// Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that 
// the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

class Solution {
    public int arrayPairSum(int[] nums) {
        return pair(nums);
    }
    public static int pair(int[] arr){
        Arrays.sort(arr);
        int ans = 0;
        for(int i = 0; i<arr.length;i+=2){
            ans = ans+Math.min(arr[i],arr[i+1]);
        }
        return ans;
    }
}
