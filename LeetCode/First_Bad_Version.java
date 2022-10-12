//LeetCode Question 278
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1;
        int h = n;
        int ans = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isBadVersion(mid)==true){
                ans = mid;
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }  
}
