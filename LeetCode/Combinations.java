// 77. Combinations
// Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
// You may return the answer in any order.
  
// Example 1:
// Input: n = 4, k = 2
// Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
// Explanation: There are 4 choose 2 = 6 total combinations.
// Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.

// Example 2:
// Input: n = 1, k = 1
// Output: [[1]]
// Explanation: There is 1 choose 1 = 1 total combination.

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        combination(n, k, list, new ArrayList<Integer>(), 1);
        return list;
    }

    public static void combination(int n, int k, List<List<Integer>> list, List<Integer> l, int last) {
        if (l.size() == k) {
            list.add(new ArrayList<>(l));
            return;
        }
        for (int i = last; i <= n; i++) {
            l.add(i);
            combination(n, k, list, l, i + 1);
            l.remove(l.size() - 1);
        }
    }
}
