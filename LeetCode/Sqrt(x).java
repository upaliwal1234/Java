// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.
// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
class Solution {
    public int mySqrt(int x) {
        long l= 1;
        long h = x;
        long ans = 0;
        while(l<=h){
            long mid = l+(h-l)/2;
            if(mid*mid<=(long)x){
                ans = mid;
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return (int)ans;
    }
    
}
