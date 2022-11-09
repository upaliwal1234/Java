import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        // char l = st.charAt(i);
        String s = ""+st.charAt(0);
        for(int i = 1; i<st.length();i++){
            if(st.charAt(i)!=st.charAt(i-1)){
                s = s+st.charAt(i);
            }
        }
        System.out.print(s);
    }
}
