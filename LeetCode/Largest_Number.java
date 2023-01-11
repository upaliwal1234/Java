// 179. Largest Number
// Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
// Since the result may be very large, so you need to return a string instead of an integer.
class Solution {
    public String largestNumber(int[] nums) {
        Sort(nums);
        String n = "";
        boolean x = false;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                x = true;
            }
            if(x==true){
                n+=""+nums[i];
            }
        }    
        if(nums.length>=1 && n.equals("")){
            return "0";
        }
        return n;
    }
    public static void Sort(int[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
		    boolean flag=false;
			for (int i = 0; i < arr.length - turn; i++) {
				if (compare(arr[i],arr[i+1])>0) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag=true;
				}

			}
			if(flag==false) {
				break;
			}
		}
	}

    public static int compare(int x1,int x2) {
        String s1=""+x1+x2;//x1x2
        String s2=""+x2+x1;
        if(Long.parseLong(s2)>Long.parseLong(s1)) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
