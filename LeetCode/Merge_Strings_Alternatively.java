// 1768. Merge Strings Alternately
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
// If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.
class Solution {
    public String mergeAlternately(String word1, String word2) {
        return merge(word1, word2);
    }
    public static String merge(String A, String B){
        String ans = "";
        int i = 0;
        while(i<A.length() && i<B.length()){
            ans+= ""+A.charAt(i);
            ans+= ""+B.charAt(i);
            i++;
        }
        while(i<A.length()){
            ans+= ""+A.charAt(i);
            i++;
        }
        while(i<B.length()){
            ans+= ""+B.charAt(i);
            i++;
        }
        return ans;
    }
}
