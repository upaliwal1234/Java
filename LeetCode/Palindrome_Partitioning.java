// 131. Palindrome Partitioning
// Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
// Example 1:
// Input: s = "aab"
// Output: [["a","a","b"],["aa","b"]]
// Example 2:
// Input: s = "a"
// Output: [["a"]]

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<List<String>>();
        palindrome_partitioning(s,list, new ArrayList<String>());
        return list;
    }
    public static void palindrome_partitioning(String s, List<List<String>> list, List<String> l){
        if(s.length() == 0){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i = 1; i <= s.length(); i++){
            String part = s.substring(0,i);
            if(isPalindrome(part)){
                l.add(part);
                palindrome_partitioning(s.substring(i), list, l);
                l.remove(l.size() - 1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
