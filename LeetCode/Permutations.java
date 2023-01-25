// 46. Permutations
// Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

// Example 1:
// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

// Example 2:
// Input: nums = [0,1]
// Output: [[0,1],[1,0]]

// Example 3:
// Input: nums = [1]
// Output: [[1]]

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        permutation(nums, list, new ArrayList<Integer>(), new boolean[nums.length]);
        return list;
    }

    public static void permutation(int[] nums, List<List<Integer>> list, List<Integer> l, boolean[] board) {
        if (l.size() == nums.length) {
            list.add(new ArrayList<>(l));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                l.add(nums[i]);
                permutation(nums, list, l, board);
                l.remove(l.size() - 1);
                board[i] = false;
            }
        }
    }
}
