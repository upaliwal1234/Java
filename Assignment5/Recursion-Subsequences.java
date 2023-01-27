// Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.
// a. Write a recursive function which returns the count of subsequences for a given string. Print the value returned.
// b. Write a recursive function which prints all possible subsequences for a “abcd” has following subsequences
// “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.given string (void is the return type for function).
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan21 = new Scanner(System.in);
        String st = scan21.next();
        System.out.println("\n"+Print_SubSequence(st, ""));
    }

    public static int Print_SubSequence(String s, String ans) {
        if (s.length() == 0) {
            System.out.print(ans+" ");
            return 1;
        }
        char ch = s.charAt(0);
        int a = Print_SubSequence(s.substring(1), ans);
        int b = Print_SubSequence(s.substring(1), ans + ch);
        return a + b;
    }
}
