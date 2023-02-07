// 904. Fruit Into Baskets
// You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits 
// where fruits[i] is the type of fruit the ith tree produces.
// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right.
// The picked fruits must fit in one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop. Given the integer array fruits, return the maximum number of fruits you can pick.
// Example 1:  Input: fruits = [1,2,1]
//             Output: 3
// Example 2:  Input: fruits = [0,1,2,2]
//             Output: 3
// Example 3:  Input: fruits = [1,2,3,2,2]
//             Output: 4
class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length == 1){
            return 1;
        }
        int ba = 0;
        int bb = 0;
        for(int i = 1; i<fruits.length; i++){
            if(fruits[i] != fruits[ba]){
                bb = i;
                break;
            }
        }
        int ei = 0;
        int ans = 0;
        while(ei < fruits.length){
            if(fruits[ei] != fruits[ba] && fruits[ei] != fruits[bb]){
                for(int i = ei - 1; fruits[i] == fruits[ei -1] ; i--){
                    if(fruits[i] == fruits[ei - 1]){
                        ba = i;
                    }
                }
                bb = ei;
            }
            ans = Math.max(ans, ei - ba + 1);
            ei++;
        }
        return ans;
    }
}
