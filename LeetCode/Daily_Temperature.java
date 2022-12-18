// 739. Daily Temperatures
// Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days
// you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        return temp(temperatures);
    }
    public int[] temp(int[] T) {
        int n = T.length;
        int[] rst = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            int j = i+1;
            while(j<n)
            {
                if(T[j]>T[i])
                {
                    rst[i] =  j-i;
                    break;
                }
                //if T[j] is colder
                if(rst[j]==0) //impossible
                    break;
                j += rst[j]; //then jump to the day hotter than T[j]   
            }
        }
        return rst;
    }

}
