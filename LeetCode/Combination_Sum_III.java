// 216. Combination Sum III
// Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
// Only numbers 1 through 9 are used.
// Each number is used at most once.
// Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        combinationSumIII(k, n, list, new ArrayList<Integer>(), 1);
        return list;
    }
    public static void combinationSumIII(int k, int n, List<List<Integer>> list, List<Integer> l, int last){
        if(n == 0 && l.size() == k){
            list.add(new ArrayList<>(l));
            return;
        }
        if(l.size() > k || n < 0 ){
            return;
        }

        for(int i = last; i<= 9; i++){
            l.add(i);
            combinationSumIII(k, n - i, list, l , i + 1);
            l.remove(l.size()-1);
        }
    }
}
