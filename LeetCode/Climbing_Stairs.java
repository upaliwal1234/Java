// 70. Climbing Stairs
// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

class Solution {
    public int climbStairs(int n){
        if (n == 0){
            return 1;
        }
        else{
            int[] N = new int[n + 1];
            N[0] = 1;
            N[1] = 1;
            for (int i = 2; i <= n; i ++){
                N[i] = N [ i - 1] + N[i - 2];
            }
            return N[n];
        }
    }
}
