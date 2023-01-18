// 17. Letter Combinations of a Phone Number
// Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
// Return the answer in any order.
// A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

class Solution {
    static String[] arr = {"","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(digits.length()==0){
            return list;
        }
        Combinations(digits, "", list);
        return list;
    }
    public static void Combinations(String digits, String ans, List<String> list){
        if(digits.length()==0){
            list.add(ans);
            return;
        }
        char ch = digits.charAt(0);
        String pr = arr[ch - '0'];
        for(int i = 0; i<pr.length(); i++){
            Combinations(digits.substring(1), ans + pr.charAt(i), list);
        }
    }
}
