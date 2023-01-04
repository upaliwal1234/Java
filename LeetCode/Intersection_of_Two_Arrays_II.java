// 350. Intersection of Two Arrays II
// Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        return inter(nums1,nums2);
    }
    public static int[] inter(int[] A, int[] B){
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] arr = new boolean[1001];
        int[] fr = new int[1001];
        for(int i = 0; i<A.length; i++){
            fr[A[i]]++;
            arr[A[i]] = true;
        }
        for(int i = 0; i<B.length; i++){
            if(arr[B[i]] == true && fr[B[i]]>0){
                list.add(B[i]);
                fr[B[i]]--;
                // arr[B[i]] = false;
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i<ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
