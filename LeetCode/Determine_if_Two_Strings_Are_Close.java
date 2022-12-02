// Two strings are considered close if you can attain one from the other using the following operations:
// Operation 1: Swap any two existing characters.
// For example, abcde -> aecdb
// Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
// For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
// You can use the operations on either string as many times as necessary.
// Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

import java.util.*;
class Determine_if_Two_Strings_Are_Close {
//     public boolean closeStrings(String word1, String word2) {
//         return string(word1,word2);
//     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextInt(); // "cabbba"
        String word2 = sc.nextInt(); // "abbccc"
        System.out.print(string(word1,word2));
    }
    public static boolean string(String w1, String w2){
        if(w1.length()==w2.length()){
            int[] arr1 = new int[123];
            int[] arr2 = new int[123];
            for(int i = 0;i<w1.length();i++){
                arr1[w1.charAt(i)]++;
                arr2[w2.charAt(i)]++;
            }
            for(int i = 0;i<w2.length();i++){
                if(arr1[w2.charAt(i)]==0){
                    return false;
                }
                if(arr2[w1.charAt(i)]==0){
                    return false;
                }
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i = 97;i<=122;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
            return true;
        }
        
        return false;
    }
}
