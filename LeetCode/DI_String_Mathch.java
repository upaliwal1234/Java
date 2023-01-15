// 942. DI String Match
// A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
// s[i] == 'I' if perm[i] < perm[i + 1], and
// s[i] == 'D' if perm[i] > perm[i + 1].
// Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
class Solution {
    public int[] diStringMatch(String s) {
        return di_String(s);
    }
    public static int[] di_String(String s){
        int[] arr = new int[s.length()+1];
        int count = 0;
        int j = 0;
        for(int i = 0; i<=s.length(); i++){
            if(i==s.length() || s.charAt(i)=='I'){
                arr[i] = count++;
                j = i-1;
                while(j>=0 && s.charAt(j)=='D'){
                    arr[j] = count++;
                    j--;
                }
            }
        }
        return arr;
    }
}
