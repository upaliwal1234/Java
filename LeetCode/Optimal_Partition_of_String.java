// 2405. Optimal Partition of String
// Given a string s, partition the string into one or more substrings such that the characters in each substring are unique.
// That is, no letter appears in a single substring more than once.
// Return the minimum number of substrings in such a partition.
// Note that each character should belong to exactly one substring in a partition.


class Solution {
    public int partitionString(String s) {
        int count = 0;
        int si = 0;
        int ei = 0;
        int[] fr = new int[256];
        while(ei<s.length()){
            fr[s.charAt(ei)]++;
            if(fr[s.charAt(ei)]>1){
                while(si<ei){
                    fr[s.charAt(si)]--;
                    si++;
                }
                count++;
            }
            if(ei==s.length()-1){
                count++;
            }
            ei++;
        }
        return count;
    }
}
