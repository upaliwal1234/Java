// 47. Permutations II
// Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        boolean[] arr = new boolean[nums.length];
        permutations(nums, arr, list, new ArrayList<Integer>());
        return list;
    }
    public static void permutations(int[] nums, boolean[] arr, List<List<Integer>> list, List<Integer> l){
        if(l.size() == nums.length){
            if(list.contains(l) == false){
                list.add(new ArrayList<>(l));
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(arr[i] == false){
                arr[i] = true;
                l.add(nums[i]);
                permutations(nums, arr, list, l);
                l.remove(l.size()-1);
                arr[i] = false;
            }
        }
    }
}
