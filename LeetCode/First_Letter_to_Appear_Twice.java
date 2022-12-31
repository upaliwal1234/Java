// 2351. First Letter to Appear Twice
// Given a string s consisting of lowercase English letters, return the first letter to appear twice.
// Note:
// A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
// s will contain at least one letter that appears twice.
class Solution {
    public char repeatedCharacter(String s) {
        int[] fr = new int[256];
        for(int i = 0; i<s.length(); i++){
            fr[s.charAt(i)]++;
            if(fr[s.charAt(i)]==2){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}
