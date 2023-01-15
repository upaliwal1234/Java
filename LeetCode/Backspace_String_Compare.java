// 844. Backspace String Compare
// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
// Note that after backspacing an empty text, the text will continue empty.
class Solution {
    public boolean backspaceCompare(String s, String t) {
        String a = backspace_String(s);
        String b = backspace_String(t);
        System.out.println(a);
        System.out.println(b);
        if(a.equals(b)){
            return true;
        }
        return false;
    }
    public static String backspace_String(String s){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
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
        String n = list.toString();
        return n;
    }
}
