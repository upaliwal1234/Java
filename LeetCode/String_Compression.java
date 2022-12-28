// 443. String Compression
// Given an array of characters chars, compress it using the following algorithm:
// Begin with an empty string s. For each group of consecutive repeating characters in chars:
// If the group's length is 1, append the character to s.
// Otherwise, append the character followed by the group's length.
// The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
// Note that group lengths that are 10 or longer will be split into multiple characters in chars.
// After you are done modifying the input array, return the new length of the array.
// You must write an algorithm that uses only constant extra space.
class Solution {
    public int compress(char[] chars) {
        return compress_string(chars);
    }
    public static int compress_string(char[] chars){
        if(chars.length==1){
            return 1;
        }
        String s = "";
        int count = 1;
        char ch = chars[0];
        for(int i = 1; i<chars.length; i++){
            if(chars[i]!=ch){
                if(count==1)
                    s+= ""+ch;
                else
                    s+= ""+ch+""+count;
                
                count = 1;
                ch = chars[i];
            }
            else{
                count++;
            }
        }
        if(chars[chars.length-1]!=chars[chars.length-2]){
            s+= ""+chars[chars.length-1];
        }
        else{
            s+= ""+chars[chars.length-1] + count;
        }
        for(int i = 0; i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}
