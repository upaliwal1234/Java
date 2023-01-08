// 791. Custom Sort String
// You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.
// Permute the characters of s so that they match the order that order was sorted. More specifically, if a character x occurs before a character y in order, 
// then x should occur before y in the permuted string.
// Return any permutation of s that satisfies this property.
class Solution {
    public String customSortString(String order, String s) {
        String snew = "";
        int[]fr = new int[256];
        for(int i = 0; i<s.length(); i++){
            fr[s.charAt(i)]++;
        }
        for(int i = 0; i<order.length(); i++){
            // if(fr[order.charAt(i)] >=1 ){
                while(fr[order.charAt(i)]>0){
                    snew+= ""+order.charAt(i);
                    fr[order.charAt(i)]--;
                }
            // }
        }
        for(int i = 0; i<s.length(); i++){
            if(fr[s.charAt(i)]>=1){
                snew+= ""+s.charAt(i);
            }
        }
        return snew;
    }
}
