// 415. Add Strings
// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
// You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
// You must also not convert the inputs to integers directly.

class Solution {
    public String addStrings(String num1, String num2) {
        return sum(num1,num2);
    }
    public static String sum(String s1, String s2){
        int[] a1 = new int[s1.length()];
        int[] a2 = new int[s2.length()];
        for(int i = 0 ; i<a1.length;i++){
            a1[i] = Integer.parseInt(s1.charAt(i)+"");
        }
        for(int i = 0 ; i<a2.length;i++){
            a2[i] = Integer.parseInt(s2.charAt(i)+"");
        }
        ArrayList<Integer> list = new ArrayList<>();
        int i = a1.length-1;
        int j = a2.length-1;
        int carry = 0;
        while(i>=0 && j>=0){
            int sum = a1[i] + a2[j] + carry;
            list.add(sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        while(i>=0){
            int sum = 0;
            sum = a1[i]+carry;
            list.add(sum%10);
            carry = sum/10;
            i--;
        }
        while(j>=0){
            int sum = 0;
            sum = a2[j]+carry;
            list.add(sum%10);
            carry = sum/10;
            j--;
        }
        if(carry!=0){
            list.add(carry);
        }
        String ans = "";
        for(int l = list.size()-1;l>=0;l--){
            ans+=list.get(l)+"";
        }
        return ans;
    }
}
