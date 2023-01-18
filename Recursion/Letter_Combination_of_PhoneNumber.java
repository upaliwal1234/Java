import java.util.*;

public class Letter_Combination_of_PhoneNumber {
    static String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main(String[] args) {
        String digits = "23";
        List<String> list = new ArrayList<String>();
        if (digits.length() == 0) {
            System.out.println(list);
            return;
        }
        Combinations(digits, "", list);
        System.out.println(list);
    }

    public static void Combinations(String digits, String ans, List<String> list) {
        if (digits.length() == 0) {
            list.add(ans);
            return;
        }
        char ch = digits.charAt(0);
        String pr = arr[ch - '0'];
        for (int i = 0; i < pr.length(); i++) {
            Combinations(digits.substring(1), ans + pr.charAt(i), list);
        }
    }
}
