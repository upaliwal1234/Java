// 989. Add to Array-Form of Integer
// The array-form of an integer num is an array representing its digits in left to right order.
// For example, for num = 1321, the array form is [1,3,2,1].
// Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        return add(num, k);
    }
    public static List<Integer> add(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        int i = arr.length-1;
        int sum = 0;
        int carry = 0;
        while(i>=0 && k>0){
            int t = k%10;
            k = k/10;
            sum = arr[i] + t + carry;
            list.add(sum%10);
            carry = sum/10;
            i--;
        }
        while(i>=0){
            sum = arr[i] + carry;
            list.add(sum%10);
            carry = sum/10;
            i--;
        }
        while(k>0){
            int t = k%10;
            k = k/10;
            sum = t + carry;
            list.add(sum%10);
            carry = sum/10;
        }
        if(carry!=0){
            list.add(carry);
        }
        List<Integer> l = new ArrayList<>();
        for(int j = list.size()-1; j>=0; j--){
            l.add(list.get(j));
        }
        return l;
    }
}
