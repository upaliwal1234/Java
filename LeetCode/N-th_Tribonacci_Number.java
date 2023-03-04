// 1137. N-th Tribonacci Number
// The Tribonacci sequence Tn is defined as follows: 
// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
// Given n, return the value of Tn.
class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return n;
        }
        if(n<=2){
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int ans = 0;
        while(n > 2){
            ans = a + b + c;
            a = b;
            b = c;
            c = ans;
            n--;
        }
        return ans;
    }
}
