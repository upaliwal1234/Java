// 67. Add Binary
// Given two binary strings a and b, return their sum as a binary string.
class Solution {
    public String addBinary(String a, String b) {
        return add_Binary(a, b);
    }
    public static String add_Binary(String s1, String s2){
        int[] a1 = new int[s1.length()];
        int[] a2 = new int[s2.length()];
        for(int i = 0; i<s1.length(); i++){
            a1[i] = Integer.parseInt(s1.charAt(i)+"");
        }
        for(int i = 0; i<s2.length(); i++){
            a2[i] = Integer.parseInt(s2.charAt(i)+"");
        }
        ArrayList<Integer> list = new ArrayList<>();
        int i = a1.length-1;
        int j = a2.length-1;
        int carry = 0;
        while(i>=0 && j>=0){
            int sum = a1[i] + a2[j] + carry;
            list.add(sum%2);
            carry = sum/2;
            i--;
            j--;
        }
        while(i>=0){
            int sum = 0;
            sum = a1[i]+carry;
            list.add(sum%2);
            carry = sum/2;
            i--;
        }
        while(j>=0){
            int sum = 0;
            sum = a2[j]+carry;
            list.add(sum%2);
            carry = sum/2;
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
