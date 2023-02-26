// 633. Sum of Square Numbers
// Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
class Solution {
    public boolean judgeSquareSum(int c) {
        int l = 0;
        int h = (int)Math.sqrt(c);
        while(l<=h){
            int sum = l*l + h*h;
            if(sum == c){
                return true;
            }
            else if(sum>c){
                h--;
            }
            else{
                l++;
            }
        }
        return false;
    }
}
