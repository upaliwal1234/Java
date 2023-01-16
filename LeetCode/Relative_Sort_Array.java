// 1122. Relative Sort Array
// Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
// Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] frq = new int[1001];
        for(int i = 0; i<arr1.length; i++){
            frq[arr1[i]]++;
        }
        int j = 0;
        for(int i = 0; i<arr2.length; i++){ 
            while(frq[arr2[i]]-- >0){
                arr1[j++] = arr2[i];
            }
        }
        for(int i = 0; i<1001; i++){
            while(frq[i]-- > 0){
                arr1[j++] = i; 
            }
        }
        return arr1;
    }
}
