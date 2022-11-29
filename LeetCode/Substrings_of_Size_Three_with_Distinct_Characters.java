// 1876. Substrings of Size Three with Distinct Characters
// A string is good if there are no repeated characters.
// Given a string s, return the number of good substrings of length three in s.
// Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
// A substring is a contiguous sequence of characters in a string.

import java.util.*;
public class Substrings_of_Size_Three_with_Distinct_Characters{
    public static void main(String[] args){
        String s = "aababcabc";
        System.out.print(Good_SubString(s));
    }

    public static int Good_SubString(String s){
        if(s.length()<3){
            return 0;
        }
        int ans = 0;
        int count = 0;
        int[] arr = new int[123];
        for(int i = 0; i<3;i++){
            if(arr[s.charAt(i)]==0){
                count++;
            }
            arr[s.charAt(i)]++;
        }
        if(count ==3){
            ans++;
        }
        for(int i = 3; i<s.length();i++){
            arr[s.charAt(i)]++;
            arr[s.charAt(i-3)]--;
            if(arr[s.charAt(i)]==1 && arr[s.charAt(i-1)]==1 && arr[s.charAt(i-2)]==1){
                ans++;
            }
        }

        return ans;
    }
}
