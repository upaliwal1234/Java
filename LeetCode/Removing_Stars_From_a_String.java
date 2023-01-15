// 2390. Removing Stars From a String
// You are given a string s, which contains stars *.
// In one operation, you can:
// Choose a star in s.
// Remove the closest non-star character to its left, as well as remove the star itself.
// Return the string after all stars have been removed.
// Note:
// The input will be generated such that the operation is always possible.
// It can be shown that the resulting string will always be unique.
class Solution {
    public String removeStars(String s) {
        return backspace_String(s);
    }
    public static String backspace_String(String s){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                if(list.size()>=1){
                    list.remove(list.size()-1);
                }
                else{
                    continue;
                }
            }
            else{
                list.add(s.charAt(i)+"");
            }
        }
        String n = "";
        for(int i = 0;i<list.size(); i++){
            n+= list.get(i);
        }
        return n;
    }
}
