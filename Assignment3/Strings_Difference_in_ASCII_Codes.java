import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String s = st.charAt(0)+"";
        for(int i = 1; i<st.length();i++){
            int dif = (int)st.charAt(i)-(int)st.charAt(i-1);
            s = s + dif + st.charAt(i);
        }
        System.out.print(s);
    }
}
