// 386. Lexicographical Numbers
// Given an integer n, return all the numbers in the range [1, n] sorted in lexicographical order.
// You must write an algorithm that runs in O(n) time and uses O(1) extra space. 
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        counting(0, n, list);
        return list;
    }
    public static void counting(int curr, int n, List<Integer> list) {
        if (curr > n) {
            return;
        }
        if(curr>0){
            list.add(curr);
        }
        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            counting(curr * 10 + i, n, list);
        }
    }
}
