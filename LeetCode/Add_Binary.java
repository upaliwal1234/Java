// 67. Add Binary
// Given two binary strings a and b, return their sum as a binary string.
class Solution {
    public String addBinary(String a, String b) {
        return Binary_Addition(a, b);
    }
    public static String Binary_Addition(String a, String b){
        ArrayList<Integer> list = new ArrayList<>();
        int i = a.length()-1;
        int j = b.length()-1;
        int sum = 0;
        int carry = 0;
        while(i >= 0 && j >= 0){
            sum = a.charAt(i) - 48 + b.charAt(j) - 48 + carry;
            list.add(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        while(i>=0){
            sum = a.charAt(i) - 48 + carry;
            list.add(sum % 2);
            carry = sum / 2;
            i--;
        }
        while(j>=0){
            sum = b.charAt(j) - 48 + carry;
            list.add(sum % 2);
            carry = sum / 2;
            j--;
        }
        if(carry > 0){
            list.add(carry);
        }
        String ans = "";
        for(int l = list.size() - 1; l>=0; l--){
            ans += list.get(l);
        }
        return ans;
    }
}
