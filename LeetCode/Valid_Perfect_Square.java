// 1385. Find the Distance Value Between Two Arrays
// Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
// The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        long l = 1;
        long h = num;
        while(l < h){
            long mid = l + (h-l)/2;
            if(mid * mid == num){
                return true;
            }
            else if(mid >= num/mid){
                h = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return false;
    }
}
