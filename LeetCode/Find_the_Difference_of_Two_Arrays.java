// 2215. Find the Difference of Two Arrays
// Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
// answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
// answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
// Note that the integers in the lists may be returned in any order.

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return difference(nums1,nums2);
    }
    public static List<List<Integer>> difference(int[] arr1, int[] arr2){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int[] a = new int[20001];
        int[] b = new int[20001];
        for(int i = 0;i< arr1.length;i++){
            if(arr1[i]<0){
                a[1000-arr1[i]]++;
            }
            else{
                a[arr1[i]]++;
            }
        }
        for(int i = 0;i< arr2.length;i++){
            if(arr2[i]<0){
                b[1000-arr2[i]]++;
            }
            else{
                b[arr2[i]]++;
            }
        }
        list.add(new ArrayList<Integer>());
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i]<0){
                if(b[1000-arr1[i]]==0){
                    list.get(0).add(arr1[i]);
                    b[1000-arr1[i]]++;
                }
            }
            else{
                if(b[arr1[i]]==0){
                    list.get(0).add(arr1[i]);
                    b[arr1[i]]++;
                }
            }
        }
        list.add(new ArrayList<Integer>());
        for(int i = 0;i<arr2.length;i++){
            if(arr2[i]<0){
                if(a[1000-arr2[i]]==0){
                    list.get(1).add(arr2[i]);
                    a[1000-arr2[i]]++;
                }
            }
            else{
                if(a[arr2[i]]==0){
                    list.get(1).add(arr2[i]);
                    a[arr2[i]]++;
                }
            }
        }
        
        return list;
    }
}
