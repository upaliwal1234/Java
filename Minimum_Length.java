// Given an integer n and an array B of n elements. We are to perform the following operation for each element while traversing through B:
// 1. At index = i, set num = B[i]-1
// 2. Add num to B [index+1]
// 3. Decrement num by 1 and increment index by 1.
// 4. Repeat steps 2 and 3 until i is greater than n or num is equal to 0.
// Note that the element which we take in every operation is of initial B [i]. See the example given below.
class Solution {
    public static int minLength(int n, int[] arr) {
        int[] arr1 = new int[n];
        arr1[0] = arr[0];
        int[] arr2 = new int[n];
        arr2[n-1] = arr[n-1];
        for(int i = 1; i<n; i++){
            arr1[i] = arr1[i-1]+ arr[i];
        }
        for(int i = n-2; i>0; i--){
            arr2[i] = arr[i] + arr2[i+1];
        }
        for(int i = 0; i<n/2; i++){
            int t = arr2[i];
            arr2[i] = arr2[n-i-1];
            arr2[n-i-1] = t;
        }
        for(int i = 0; i<n; i++){
            if(arr1[i] == arr2[i]){
                return i+1;
            }
        }
        return n;
    }
}
