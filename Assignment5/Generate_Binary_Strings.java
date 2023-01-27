// Given a string containing of ‘0’, ‘1’ and ‘?’ wildcard characters, generate all binary strings that can be formed by replacing each
// wildcard character by ‘0’ or ‘1’.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int t = scan21.nextInt();
        while(t > 0){
            String s = scan21.next();
            Binary_String(s, "", 0);
            System.out.println();
            t--;
        }
    }
    public static void Binary_String(String s, String ans, int i) {
        if (i == s.length()) {
            System.out.print(ans + " ");
            return;
        }
        if (s.charAt(i) == '?') {
            Binary_String(s, ans + '0', i + 1);
            Binary_String(s, ans + '1', i + 1);
        } 
        else {
            Binary_String(s, ans + s.charAt(i), i + 1);
        }
    }
}
