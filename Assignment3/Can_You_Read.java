import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for(int i =0;i<st.length();i++){
            if(st.charAt(i)<'a'){
                System.out.println();
                System.out.print(st.charAt(i));
            }
            else{
                System.out.print(st.charAt(i));

            }
        }
    }
}
