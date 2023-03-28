// 503. Next Greater Element II
// Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.
// The next greater number of a number x is the first greater number to its traversing-order next in the array,
// which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans, -1);
        for(int i = 0; i < 2 * len; ++i){
            int n = nums[i % len];
            while(!st.isEmpty() && nums[st.peek()] < n){
                ans[st.pop()] = n;
            }
            if(i < len){
                st.push(i);
            }
        }
        return ans;
    }       
}
