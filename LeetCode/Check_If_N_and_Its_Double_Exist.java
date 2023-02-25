// 1346. Check If N and Its Double Exist
// Given an array arr of integers, check if there exist two indices i and j such that :
// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]

class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++){
            int l = 0;
            int h = arr.length - 1;
            while(l <= h){
                int mid = l + (h - l)/2;
                if(arr[mid] == 2 * arr[i] && mid!=i){
                    return true;
                }
                if(arr[mid] > 2 * arr[i]){
                    h = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
        }
        return false;
    }
}
