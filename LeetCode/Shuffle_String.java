// 1528. Shuffle String
// You are given a string s and an integer array indices of the same length.
// The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
// Return the shuffled string.
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        for(int i = 0; i<indices.length; i++){
            ch[indices[i]] = s.charAt(i);
        }
        String ans = "";
        for(int i = 0; i<ch.length; i++){
            ans+= ""+ch[i];
        }
        return ans;
    }
}
