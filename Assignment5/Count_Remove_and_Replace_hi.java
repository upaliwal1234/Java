// Take as input str, a string. 
// a.Write a recursive function which counts the number of times ‘hi’ appears in the string.  Print the value returned.
// b.Write a recursive function which removes all ‘hi’ in the string. Print the value returned. 
// c.Write a recursive function which replaces all ‘hi’ in the string with ‘bye’. Print the value returned.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        String str = scan21.next();
        replace_hi_problem(str, "", "", 0);
    }
    public static int replace_hi_problem(String str, String sna1, String sna2, int z){
        if(str.length() == 0){
            System.out.println(z);
            System.out.println(sna1);
            System.out.println(sna2);
            return z;
        }
        if(str.length() > 2 && "hit".equals(str.substring(0,3))){
            return replace_hi_problem(str.substring(1), sna1+"h", sna2+"h", z);
        } 
        if(str.length() > 1 && ("hi".equals(str.substring(0,2)))){
            return replace_hi_problem(str.substring(2), sna1, sna2 + "bye", z+1);
        }
        else{
            return replace_hi_problem(str.substring(1), sna1 + str.charAt(0), sna2 + str.charAt(0), z);
        }
    }
}
