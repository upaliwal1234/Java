// 2300. Successful Pairs of Spells and Potions
// You are given two positive integer arrays spells and potions, of length n and m respectively,
// where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.
// You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.
// Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int[] arr = new int[n];
        Arrays.sort(potions);
        for(int i = 0; i < n; i++){
           arr[i] = potions.length - firstSuccess(spells[i], potions, success);
        }
        return arr;
    }

    public static int firstSuccess(int spell, int[] potions, long success ){
        int l = 0;
        int h = potions.length;

        while(l < h){
            int mid = l + (h - l)/2;
            if( (long)spell * potions[mid] >= success ){
                h = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
}
