import java.util.*;

public class String_Partioning {
    public static void main(String[] args) {
        String s = "nitin";
        palindrome_partitioning(s, new ArrayList<String>());
    }

    public static void palindrome_partitioning(String s, List<String> l) {
        if (s.length() == 0) {
            System.out.println(l);
            ;
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String part = s.substring(0, i);
            if (isPalindrome(part)) {
                l.add(part);
                palindrome_partitioning(s.substring(i), l);
                l.remove(l.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}