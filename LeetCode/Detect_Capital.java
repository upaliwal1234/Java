// 520. Detect Capital
// We define the usage of capitals in a word to be right when one of the following cases holds:
// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.
class Solution {
    public boolean detectCapitalUse(String word) {
        for(int i = 1; i<word.length(); i++){
            if(word.charAt(0)>90 && word.charAt(i)<=90){
                return false;
            }
            if(word.charAt(i-1)>90 && word.charAt(i)<=90){
                return false;
            }
            if(i>=2 && word.charAt(i)>90 && word.charAt(i-1)<=90 && word.charAt(i-2)<=90 ){
                return false;
            }
        }
        return true;
    }
}
