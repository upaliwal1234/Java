// 43. Multiply Strings
// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
// Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        String sb = "";
        int[] pos = new int[m + n];
        for (int i = m - 1; i >= 0; i--){
            for (int j = n - 1; j >= 0; j--) {
                int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = multiply + pos[i + j + 1];
                pos[i + j] += sum / 10;
                pos[i + j + 1] = sum % 10;
            }
        }
        for (int p = 0; p < pos.length; p++){
            if (pos[p] > 0 || sb.length() > 0){
                sb += pos[p];
            }
        }
        if(sb.length() == 0){
            return "0";
        }
        return sb.toString();
    }
}
