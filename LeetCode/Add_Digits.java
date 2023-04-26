// 258. Add Digits
// Easy
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
class Solution {
    public int addDigits(int num) { 
        if(num<10){
            return num;
        }
        else{
            int ans = num%9;
            if(ans==0){
                return 9;
            }
            else{
                return ans;
            }
        }
    }
}
