// 90. Subsets II
// Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.
// Example 1:  Input: nums = [1,2,2]
//             Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
// Example 2:  Input: nums = [0]
//             Output: [[],[0]]

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        subset(nums, list, new ArrayList<Integer>(), 0);
        return list;
    }
    public static void subset(int[] nums, List<List<Integer>> list, List<Integer> l, int lst){
        list.add(new ArrayList<>(l));
        for(int i = lst; i < nums.length; i++){
            if(i == lst || nums[i] != nums[i-1]){
                l.add(nums[i]);
                subset(nums, list, l, i + 1);
                l.remove(l.size() - 1);
            }
        }
    }
}
