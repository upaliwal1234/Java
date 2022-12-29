// 567. Permutation in String
// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
// In other words, return true if one of s1's permutations is the substring of s2.
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        return Inclusion(s1, s2);
    }
    public static boolean Inclusion(String s1, String s2){
        for(int i = 0; i<s2.length() && i+s1.length()<=s2.length(); i++){
            if(permutation(s1, s2.substring(i, i+s1.length()))){
                return true;
            }
        }
        return false;
    }
    public static boolean permutation(String s1, String s2){
        int[] fra = new int[256];
        int[] frb = new int[256];
        for(int i = 0; i<s1.length(); i++){
            fra[s1.charAt(i)]++;
        }
        for(int i = 0; i<s2.length(); i++){
            frb[s2.charAt(i)]++;
        }
        for(int i = 0; i<s1.length(); i++){
            if(fra[s1.charAt(i)]!=frb[s1.charAt(i)]){
                return false;
            }
        }
        return true;
    }
}
