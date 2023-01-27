// Take as input str, a string. str represents keys pressed on a nokia phone keypad. We are concerned with all possible words that can be written with the pressed keys.
// Assume the following alphabets on the keys: 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz
// E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”
// // a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.
// b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).

import java.util.*;
public class Main {
    static String[] arr = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

    public static void main(String[] args) {
        Scanner scan21 = new Scanner(System.in);
        String digits = scan21.next();
        System.out.print("\n"+Combinations(digits, ""));
    }

    public static int Combinations(String digits, String ans) {
        if (digits.length() == 0) {
            System.out.print(ans+" ");
            return 1;
        }
        char ch = digits.charAt(0);
        String pr = arr[ch - '0'];
        int count = 0;
        for (int i = 0; i < pr.length(); i++) {
            count += Combinations(digits.substring(1), ans + pr.charAt(i));
        }
        return count;
    }
}
