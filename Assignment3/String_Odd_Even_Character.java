import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print(odd_even(st));
    }
    public static String odd_even(String st){
        String snew = "";
        for(int i = 0; i<st.length(); i++){
            if(i%2==0){
                snew += (char)((int)st.charAt(i) + 1);
            }
            else{
                snew += (char)((int)st.charAt(i) - 1);
            }
        }
        return snew;
    }
}
