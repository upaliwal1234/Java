// Monu Bhaiya is going to Shimla. he has met two friends whose name is a strings m and n respectively. 
// Check whether their name is an anagram if yes then print an array of all the start indices of n's anagrams in m. else print an empty list
// Anagram means: A word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
import java.util.*;
public class Main{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String ptr = scan.next();
        char[] gvr = ptr.toCharArray();
        Arrays.sort(gvr);
        String snew = String.valueOf(gvr);
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i<=str.length()-ptr.length(); i++){
            String tp = str.substring(i,i+ptr.length());
            char[] st = tp.toCharArray();
            Arrays.sort(st);
            tp = String.valueOf(st);
            if(tp.equals(snew)){
                lst.add(i);
            }
        }
        System.out.print(lst);
    }
}
