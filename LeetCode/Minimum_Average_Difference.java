// 2256. Minimum Average Difference
// You are given a 0-indexed integer array nums of length n.
// The average difference of the index i is the absolute difference between the average of the first i + 1 elements of nums and
// the average of the last n - i - 1 elements.
// Both averages should be rounded down to the nearest integer.
// Return the index with the minimum average difference. If there are multiple such indices, return the smallest one.
// Note:
// The absolute difference of two numbers is the absolute value of their difference.
// The average of n elements is the sum of the n elements divided (integer division) by n.
// The average of 0 elements is considered to be 0.
  
class Solution {
    public int minimumAverageDifference(int[] nums) {
        return Average(nums);
    }
    public static int Average(int[] nums ){
        int allSum = 0;
        for(int i = 0;i<nums.length;i++){
            allSum += nums[i];
        }
            
        int minAvgDif = 50001;
        int answer = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int dif = (int)(sum/(i+1));
            int dif2;
            if (i == nums.length - 1)
                dif2=0;
            else
                dif2 = (int)((allSum-sum)/(nums.length-(i+1)));
            if(minAvgDif > Math.abs(dif - dif2)){
                answer = i;
                minAvgDif = Math.min(Math.abs(dif -dif2),minAvgDif);
            }
        }        
        return answer;
    }
}
