// 1456. Maximum Number of Vowels in a Substring of Given Length
// Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
// Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length
{
    public static void main(String[] args){
        String s = "abciiidef";
        int k = 3;
        System.out.print(Vowels(s,k));
    }
    public static int Vowels(String s, int k){
        int ans = 0;
        int count = 0;
        for(int i = 0; i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        ans = count;
        for(int i = k; i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            ans = Math.max(ans, count);
        }
        
        return ans;
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch == 'u'){
            return true;
        }
        else{
            return false;
        }
    }
}
