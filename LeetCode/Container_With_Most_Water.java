// 11. Container With Most Water
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

class Solution {
    public int maxArea(int[] height) {
        return max(height);
    }
    public static int max(int[] arr){   
        int i = 0;
        int j = arr.length-1;
        int area = 0;
        while(i<j){
            area = Math.max(area, Math.min(arr[i],arr[j])*(j-i));
            if(arr[i]<arr[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return area;
    }
    
}
