// 1470. Shuffle the Array
// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].
class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(nums.length==0){
            return nums;
        }
        int[] arr = new int[2*n];
        int i = 0;
        int j = n;
        int k = 0;
        while(j<2*n){
            arr[k++] = nums[i++];
            arr[k++] = nums[j++];
        }
        return arr;
    }
}
