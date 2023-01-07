// 678. Valid Parenthesis String
// Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
// The following rules define a valid string:
// Any left parenthesis '(' must have a corresponding right parenthesis ')'.
// Any right parenthesis ')' must have a corresponding left parenthesis '('.
// Left parenthesis '(' must go before the corresponding right parenthesis ')'.
// '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
class Solution {
    public boolean checkValidString(String s) {
        int low = 0;  // Lower bound of valid '(' count
        int high = 0; // Upper bound of valid '(' count
        for (int i = 0; i<s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    ++low;
                    ++high;
                    break;
                case ')':
                    low = Math.max(0, --low);
                    --high;
                    break;
                case '*':
                    low = Math.max(0, --low);
                    ++high;
                    break;
            }
            if (high < 0){
                return false;
            }
        }
        return low == 0;
    }
}
