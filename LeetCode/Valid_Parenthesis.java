// 20. Valid Parentheses
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
class Solution {
    public boolean isValid(String s) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i<s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                list.add(s.charAt(i)+"");
            }
            else if (s.charAt(i) == ')' && list.size()>0 && list.get(list.size()-1).charAt(0) == '(') {
                list.remove(list.size()-1);
            } 
            else if (s.charAt(i) == ']' && list.size()>0 && list.get(list.size()-1).charAt(0) == '[') {
                list.remove(list.size()-1);
            }
            else if (s.charAt(i) == '}' && list.size()>0 && list.get(list.size()-1).charAt(0) == '{') {
                list.remove(list.size()-1);
            }
            else {
                return false;
            }
        }
        if(list.size()==0){
            return true;
        }
        return false;
    }
}
