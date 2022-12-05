// 268. Missing Number
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

class Solution {
    public int missingNumber(int[] nums) {
        return number(nums);
    }
    public static int number(int[] arr){
        Arrays.sort(arr);
        int[] rra = new int[arr.length+1];
        for(int i = 0; i<rra.length;i++){
            rra[i] = i;
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=rra[i]){
                return rra[i];
            }
        }
        return rra[rra.length-1];
    }
} 
