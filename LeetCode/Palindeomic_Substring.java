// LeetCode 647 Palindromic Substrings
import java.util.*;
public class Palindromic_SubStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(Palindrome_SubString(str));
        sc.close();
    }
  
    public static int Palindrome_SubString(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                if(Palindrome(str.substring(i,j))){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean Palindrome(String str1) {
        int i = 0;
        int j = str1.length() - 1;
        while (i < j) {
            if (str1.charAt(i) != str1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
