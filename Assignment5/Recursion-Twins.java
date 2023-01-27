// Take an input str, a string. A “twin” is defined as two instances of a char separated by a char. 
// E.g. "AxA" the A's make a “twin”. “twins” can overlap, so "AxAxA" contains 3 “twins” - 2 for A and 1 for x. 
// Write a function which recursively counts number of “twins” in a string. Print the value returned.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        String ans = scan21.next();
        twins_recursion(ans, 0);
    }
    public static void twins_recursion(String ans, int z) {
        if(ans.length()==2) {
            System.out.println(z);
            return;
        }
        char ch1=ans.charAt(0);
        char ch2=ans.charAt(2);
        if(ch1==ch2) {
            z++;
        }
        twins_recursion(ans.substring(1),z);
    }
}
