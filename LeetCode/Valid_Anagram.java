// 242. Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] fr1 = new int[256];
        int[] fr2 = new int[256];
        for(int i = 0; i<s.length(); i++){
            fr1[s.charAt(i)]++;
            fr2[t.charAt(i)]++;
        }
        for(int i = 0; i<t.length(); i++){
            if(fr1[t.charAt(i)]!=fr2[t.charAt(i)]){
                return false;
            }
        }
        return true;
    }
}
