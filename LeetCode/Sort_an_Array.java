// 912. Sort an Array
// Given an array of integers nums, sort the array in ascending order and return it.
// You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
class Solution {
    public int[] sortArray(int[] nums) {
        return Merge(nums, 0, nums.length - 1);
    }
    public static int[] Merge(int[] arr, int si, int ei){
        if (si == ei) {
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		int mid = (si + ei) / 2;
		int[] fa = Merge(arr, si, mid);
		int[] sa = Merge(arr, mid + 1, ei);
		return MergeTwoArray(fa, sa);
	}

	public static int[] MergeTwoArray(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0;// arr1
		int j = 0;// arr2
		int k = 0;// ans
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			}
            else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < m) {

			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;
	}

}
