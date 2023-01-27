// Replace all occurrences of pi with 3.14
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        while(n-- > 0){
            String s = scan21.next();
            System.out.println(replace_pi(s,0));
        }
    }
    public static String replace_pi(String str, int i){
        if(i+1 >= str.length()){
            return str;
        }
        if(str.charAt(i) == 'p' && str.charAt(i+1) == 'i'){
            str = str.substring(0, i) + "3.14" + str.substring(i+2);
        }
        String ans = replace_pi(str, i+1);
        return ans;
    }
}
