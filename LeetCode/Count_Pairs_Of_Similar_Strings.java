// 2506. Count Pairs Of Similar Strings
// You are given a 0-indexed string array words.
// Two strings are similar if they consist of the same characters.
// For example, "abca" and "cba" are similar since both consist of characters 'a', 'b', and 'c'.
// However, "abacba" and "bcfd" are not similar since they do not consist of the same characters.
// Return the number of pairs (i, j) such that 0 <= i < j <= word.length - 1 and the two strings words[i] and words[j] are similar.
class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        for(int i = 0; i<words.length-1; i++){
            for(int j = i+1; j<words.length; j++){
                if(similar(words[i], words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean similar(String s1, String s2){
        int[] fr1 = new int[256];
        int[] fr2 = new int[256];
        int i = 0;
        int j = 0;
        while(i<s1.length() && j<s2.length()){
            fr1[s1.charAt(i++)]++;
            fr2[s2.charAt(j++)]++;
        }
        while(i<s1.length()){
            fr1[s1.charAt(i++)]++;
        }
        while(j<s2.length()){
            fr2[s2.charAt(j++)]++;
        }
        for(int l = 0; l<s1.length(); l++){
            if(fr2[s1.charAt(l)]==0){
                return false;
            }
        }
        for(int l = 0; l<s2.length(); l++){
            if(fr1[s2.charAt(l)]==0){
                return false;
            }
        }
        return true;
    }
}
