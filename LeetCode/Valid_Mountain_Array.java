
class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length <3)
            return false;
        int flag = 0;
        if(arr[1]<arr[0]){
            return false;
        }
        for(int i = 1; i<arr.length; i++){
            if(flag == 0 && arr[i-1]<arr[i]){
                continue;
            }
            else if(flag == 0 && arr[i-1]>arr[i]){
                flag = 1;
            }
            else if(flag ==1 && arr[i-1]>arr[i]){
                continue;
            }
            else if(flag == 1 && arr[i-1]<arr[i]){
                return false;
            }
            else{
                return false;
            }
        }
        if(flag == 0){
            return false;
        }
        return true;
    }
}
