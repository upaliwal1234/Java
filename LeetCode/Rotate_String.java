// 796. Rotate String
// Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
// A shift on s consists of moving the leftmost character of s to the rightmost position.
// For example, if s = "abcde", then it will be "bcdea" after one shift.

class Solution {
    public boolean rotateString(String s, String goal) {
        return rotate(s,goal);
    }
    public static boolean rotate(String a, String b){
        if(a.equals(b)){
            return true;
        }
        String s = "";
        int i = 0;
        for(int j = 1; j<a.length(); j++){
            s = a.substring(j, a.length()) + a.substring(i, j);
            if(b.equals(s)){
                return true;
            }
        }
        return false;
    }
}
