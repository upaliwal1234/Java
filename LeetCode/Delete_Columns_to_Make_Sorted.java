// 944. Delete Columns to Make Sorted
// You are given an array of n strings strs, all of the same length.
// The strings can be arranged such that there is one on each line, making a grid. For example, strs = ["abc", "bce", "cae"] can be arranged as:
// abc
// bce
// cae
// You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and
// 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
// Return the number of columns that you will delete.
class Solution {
    public int minDeletionSize(String[] strs) {
        String[] p = grid(strs);
        int count = 0;
        for(int i = 0; i<p.length; i++){
            if(isSorted(p[i])){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
    public static String[] grid(String[] strs){
        String[] tt = new String[strs[0].length()];
        for(int i = 0; i<tt.length; i++){
            String sp = "";
            for(int j = 0; j<strs.length; j++){
                sp+= ""+strs[j].charAt(i);
            }
            tt[i] = sp;
        }
        return tt;
    }
    public static boolean isSorted(String st){
        char[] ch = new char[st.length()];
        for(int i = 0; i<ch.length; i++){
            ch[i] = st.charAt(i);
        }
        Arrays.sort(ch);
        String s = "";
        for(int i = 0; i<ch.length; i++){
            s+= ""+ch[i];
        }
        if(s.equals(st)){
            return true;
        }
        else{
            return false;
        }
    }
}
