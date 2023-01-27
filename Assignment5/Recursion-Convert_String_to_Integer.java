// Take as input str, a number in form of a string.
// Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234.
// Print the value returned.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        String st = scan21.next();
        System.out.print(stringToInteger(st, st.length()-1));
    }
    public static int stringToInteger(String st, int i){ 
        if(i < 0){
            return 0;
        }

        return stringToInteger(st, i-1) * 10 + st.charAt(i) - '0';
    }
}
