// 1095. Find in Mountain Array
// (This problem is an interactive problem.)
// You may recall that an array arr is a mountain array if and only if:
// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
// You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
// MountainArray.get(k) returns the element of the array at index k (0-indexed).
// MountainArray.length() returns the length of the array.
// Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer.
// Also, any solutions that attempt to circumvent the judge will result in disqualification.
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // first find the index of peak of the mountain
        int len = mountainArr.length()-1;
        int peak = 0;
        int i = 0;
        int j = len;
        int mid = 0;
        while (i < j) {
            mid = (i + j) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)){
                i = peak = mid + 1;
            }
            else{
                j = mid;
            }
        }
        // System.out.print(peak);
        i = 0;
        j = peak;
        // search in left of the peak
        while(i <= j){
            mid = i + (j - i) / 2;
            if(mountainArr.get(mid)>target){
                j = mid - 1;
            }
            else if(mountainArr.get(mid)<target){
                i = mid + 1;
            }
            else{
                return mid;
            }
        }
        // search in rigth of the peak
        i = peak;
        j = len;
        while(i <= j){
            mid = i + (j - i) / 2;
            if(mountainArr.get(mid)>target){
                i = mid + 1;
            }
            else if(mountainArr.get(mid)<target){
                j = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
