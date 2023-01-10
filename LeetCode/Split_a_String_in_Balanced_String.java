// 1221. Split a String in Balanced Strings
// Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
// Given a balanced string s, split it into some number of substrings such that:
// Each substring is balanced.
// Return the maximum number of balanced strings you can obtain.
class Solution {
    public int balancedStringSplit(String s) {
        int si = 0;
        int ei = 1;
        int count = 0;
        while(ei<s.length()){
            if(balanced(s.substring(si,ei+1))){
                count++;
                si = ei+1;
            }
            ei+=2;
        }
        return count;
    }
    public static boolean balanced(String s){
        int R = 0;
        int L = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='R'){
                R++;
            }
            else if(s.charAt(i)=='L'){
                L++;
            }
        }
        if(R == L){
            return true;
        }
        return false;
    }
}
