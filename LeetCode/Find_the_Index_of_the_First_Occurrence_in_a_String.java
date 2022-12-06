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
