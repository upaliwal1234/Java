// 66. Plus One
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
// The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.
class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = digits[digits.length-1]+1;
        list.add(sum%10);
        int carry = sum/10;
        for(int i = digits.length-2; i>=0; i--){
            sum = digits[i]+carry;
            list.add(sum%10);
            carry = sum/10;
        }
        if(carry>0){
            list.add(carry);
        }
        int[] arr = new int[list.size()];
        int j = 0;
        for(int i = list.size()-1; i>=0; i--){
            arr[j++] = list.get(i);
        }
        return arr;
    }
}
