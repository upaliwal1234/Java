// Take as input str, a string. Write a recursive function that checks if the string was generated using the following rules and returns a Boolean value:
// 1. the string begins with an 'a'
// 2. each 'a' is followed by nothing or an 'a' or "bb"
// 3. each "bb" is followed by nothing or an 'a' Print the value returned.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner rubix_scanner = new Scanner(System.in);
        String st = rubix_scanner.next();
        System.out.print(String_obidient(st, 0));
    }
    public static boolean String_obidient(String st, int i) {
        if (i == st.length()) {
            return true;
        }
        if (i == 0 && st.charAt(i) != 'a') {
            return false;
        }
        if (st.charAt(i) == 'a' && i + 1 < st.length()) {
            if (st.charAt(i + 1) != 'a' && (i + 2 < st.length() && !st.substring(i + 1, i + 3).equals("bb"))) {
                return false;
            } else if (i + 1 == st.length() - 1 && st.charAt(i + 1) == 'b') {
                return false;
            }
        }
        if (i + 2 < st.length() && st.substring(i, i + 2).equals("bb")) {
            if (st.charAt(i + 2) != 'a') {
                return false;
            }
        }
        if (i == st.length() - 2 && st.substring(i, i + 2).equals("bb")) {
            return true;
        }
        if (i == st.length() - 1 && st.charAt(i) == 'a') {
            return true;
        }

        if (String_obidient(st, i + 1)) {
            return true;
        }
        return false;
    }
}
