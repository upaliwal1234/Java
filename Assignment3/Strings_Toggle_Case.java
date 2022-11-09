import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String snew = "";
        for(int i = 0; i<st.length(); i++){
            if(st.charAt(i)<'a'){
                snew+=(char)((int)st.charAt(i)+32);
            }
            else{
                snew+=(char)((int)st.charAt(i)-32);
            }
        }
        System.out.print(snew);
    }

}
