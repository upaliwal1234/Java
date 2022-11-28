// LeetCode 76. Minimum Window Substring

// Given two strings s and t of lengths m and n respectively, return the minimum window substring of s 
// such that every character in t (including duplicates) is included in the window.
// If there is no such substring, return the empty string "".

import java.util.Scanner;

public class Minimum_Window_Size_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "ADOBECODEBANC"; // sc.next();
        String t = "ABC"; // sc.next();
        System.out.println(MinimumWindow(s, t));
        sc.close();
    }

    public static String MinimumWindow(String s, String t) {
        int[] freqt = new int[123];
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            freqt[ch]++;
        }
        int[] freqs = new int[123];
        int si = 0;
        int ei = 0;
        int start = -1;
        int len = Integer.MAX_VALUE;
        int count = 0;
        while (ei < s.length()) {
            // grow
            char ch = s.charAt(ei);
            freqs[ch]++;
            if (freqt[ch] >= freqs[ch]) {
                count++;
            }

            // shrink
            if (count == t.length()) {
                while (freqs[s.charAt(si)] > freqt[s.charAt(si)] && si <= ei) {
                    freqs[s.charAt(si)]--;
                    si++;
                }

                // ans
                if (len > (ei - si + 1)) {
                    len = ei - si + 1;
                    start = si;
                }
            }

            ei++;
        }
        if (start == -1) {
            return "";
        }
        return s.substring(start, start + len);
    }

}
