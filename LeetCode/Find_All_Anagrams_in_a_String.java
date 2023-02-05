// 438. Find All Anagrams in a String
// Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
// Example 1:  Input: s = "cbaebabacd", p = "abc"
//             Output: [0,6]
// Example 2:  Input: s = "abab", p = "ab"
//             Output: [0,1,2]
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        int si = 0;
        int ei = p.length() - 1;
        while(ei < s.length()){
            String str = s.substring(si, ei + 1);
            if(isAnagram(str, p)){
                list.add(si);
            }
            si++;
            ei++;
        }
        return list;
    }
    public static boolean isAnagram(String s, String p){
        int[] frs = new int[256];
        int[] frp = new int[256];
        for(int i = 0; i<s.length(); i++){
            frs[s.charAt(i)]++;
            frp[p.charAt(i)]++;
        }
        for(int i = 0; i<s.length(); i++){
            if(frs[s.charAt(i)] != frp[s.charAt(i)]){
                return false;
            }
        }
        return true;
    }
}
