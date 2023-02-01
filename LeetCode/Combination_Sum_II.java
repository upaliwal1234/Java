// 40. Combination Sum II
// Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
// Each number in candidates may only be used once in the combination.
// Note: The solution set must not contain duplicate combinations.
// Example 1:
// Input: candidates = [10,1,2,7,6,1,5], target = 8
// Output: [[1,1,6],[1,2,5],[1,7],[2,6]]
// Example 2:
// Input: candidates = [2,5,2,1,2], target = 5
// Output: [[1,2,2],[5]]

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Combination(target, candidates, list, new ArrayList<Integer>(), 0, 0);
        return list;
    }
    public static void Combination(int n, int[] arr, List<List<Integer>> list,ArrayList<Integer> l, int sum, int last) {
        if (sum == n) {
            if(!list.contains(l)){
                list.add(new ArrayList<>(l));
            }
            return;
        }
        // if (sum > n) {
        //     return;
        // }
        for (int i = last; i < arr.length && sum + arr[i] <= n; i++) {
            if(i == last || arr[i] != arr[i-1]){
                l.add(arr[i]);
                Combination(n, arr, list, l, sum + arr[i], i+1);
                l.remove(l.size()-1);
            }
        }
    }
}
