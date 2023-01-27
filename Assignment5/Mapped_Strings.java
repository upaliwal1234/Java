// We are given a hashmap which maps all the letters with number. Given 1 is mapped with A, 2 is mapped with B…..
// 26 is mapped with Z. Given a number, you have to print all the possible strings.

import java.util.*;
public class Main {
  static String[] rra ={"","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        String str = scan21.next();
        mapped_strings(str,"");
    }
    public static void mapped_strings(String abcd,String xyz){
        if(abcd.length()==0){
            System.out.println(xyz);
            return;
        }
        char ch=abcd.charAt(0);
        String s = rra[ch-'0'];
        mapped_strings(abcd.substring(1),xyz+s);
        if(abcd.length()>=2){
            String s1=abcd.substring(0,2);
            int n=Integer.parseInt(s1);
            if(n<=27){
            mapped_strings(abcd.substring(2),xyz+rra[n]);
            }
        }
    }
}
