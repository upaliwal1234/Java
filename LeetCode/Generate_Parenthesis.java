// 22. Generate Parentheses
// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        Parenthesis(n, "", 0, 0, list);
        return list;
    }
    private static void Parenthesis(int n, String ans, int open, int close, List<String> list) {
        if (open == n && close == n) {
            list.add(ans);
            return;
        }
        if (open < n) {
            Parenthesis(n, ans + "(", open + 1, close, list);
        }
        if (close < open) {
            Parenthesis(n, ans + ")", open, close + 1, list);
        }
    }
}
