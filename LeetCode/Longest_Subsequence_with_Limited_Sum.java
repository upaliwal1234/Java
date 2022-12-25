// 2389. Longest Subsequence With Limited Sum
// You are given an integer array nums of length n, and an integer array queries of length m.
// Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements
//    is less than or equal to queries[i].
// A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        return answer(nums, queries);
    }
    public static int[] answer(int[] nums, int[] queries){
        Arrays.sort(nums);
        int[] ans = new int[queries.length];
        for(int i = 0; i<queries.length; i++){
            int si = 0;
            int ei = 0;
            int s = 0;
            int max = 0;
            while(ei<nums.length){
                s+=nums[ei];
                while(s>queries[i]){
                    s-=nums[si];
                    si++;
                }
                max = Math.max(max, ei-si+1);
                ei++;
            }
            ans[i] = max;
        }
        return ans;
    }
}
