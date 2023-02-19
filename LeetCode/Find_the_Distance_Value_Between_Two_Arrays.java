// 1385. Find the Distance Value Between Two Arrays
// Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
// The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            boolean flag = true;
            for(int j = 0; j < arr2.length; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                count++;
            }
        }
        return count;
    }
}
