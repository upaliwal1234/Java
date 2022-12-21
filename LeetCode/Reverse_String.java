// 541. Reverse String II
// Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
// If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters,
// then reverse the first k characters and leave the other as original.
class Solution {
    public String reverseStr(String s, int k) {
        return reverse(s,k);
    }
    public static String reverse(String a, int k){
        if(a.length()==1){
            return a;
        }
        String ans = "";
        for(int i = 0; i<a.length();i+=2*k){
            int las = i+k;
            if(i+k>a.length()){
                las = (i+k) - (i+k-a.length());
            }
            ans+= "" + rev(a.substring(i,las));
            int start = i+k;
            if(i+k>a.length()-1){
                break;
            }
            int l = i+2*k;
            if(i+2*k > a.length()){
                l = (i+2*k) - (i+2*k - a.length());
            }
            ans+= "" + st(a.substring(start,l));
        }
        return ans;
    }
    public static String rev(String str){
        String revs = "";
        for(int i = str.length()-1; i>=0; i--){
            revs+= "" + str.charAt(i);
        }
        return revs;
    }
    public static String st(String stra){
        return stra;
    }
}
