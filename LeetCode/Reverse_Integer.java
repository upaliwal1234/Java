// 7. Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed
// 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
class Solution {
    public int reverse(int x) {
        return rev(x);
    }
    public static int rev(int num){
        int s = 1;
        if(num<0){
            s = -1;
        }
        num = Math.abs(num);
        long re = 0;
        while(num>0){
            long t = num%10;
            num = num/10;
            re = re*10 + t;
        }
        if(re>Integer.MAX_VALUE || re<Integer.MIN_VALUE){
            return 0;
        }
        else{
            return (int)(re * s);
        }
    }
}
