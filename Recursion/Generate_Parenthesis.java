import java.util.*;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        Parenthesis(n, "", 0, 0, list);
        return list;
    }

    public static void Parenthesis(int n, String ans, int open, int close, List<String> list) {
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