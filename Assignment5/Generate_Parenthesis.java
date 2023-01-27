// Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
// The output strings should be printed in the sorted order considering '(' has higher value than ')'.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        Parenthesis(n, "", 0 , 0);
    }
    public static void Parenthesis(int n, String ans, int open, int close) {
        if (open == n && close == n) {
            System.out.println(ans);
            return;
        }
        if (close < open) {
            Parenthesis(n, ans + ")", open, close + 1);
        }
        if (open < n) {
            Parenthesis(n, ans + "(", open + 1, close);
        }

    }
}
