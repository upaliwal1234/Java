// 28. Find the Index of the First Occurrence in a String
// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

class Solution {
    public int strStr(String haystack, String needle) {
        return str(haystack,needle);
    }
    public static int str(String s, String t){
        int si = 0;
        while(si<=s.length()-t.length()){
            if((s.substring(si,si+t.length())).equals(t)){
                return si;
            }
            else{
                si++;
            }
        }
        return -1;
    }
}


// Solution 2
// Approach: Sliding Window
// Runtime Beats 100%
class Solution {
    public int strStr(String haystack, String needle) {
        return str(haystack,needle);
    }
    public static int str(String s, String t){
        if(s.length() < t.length()){
            return -1;
        }
        int si = 0;
        int ei = t.length();
        if(s.substring(si, ei).equals(t)){
            return si;
        }
        si++;
        ei++;
        while(ei <= s.length()){
            if(s.substring(si, ei).equals(t)){
                return si;
            }
            else{
                si++;
                ei++;
            }
        }
        return -1;
    }
}
