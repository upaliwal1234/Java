import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int x= 0;
        int max = 0;
        for(int i = 0; i<st.length(); i++){
            if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u'){
                x++;
                if(max<x){
                    max = x;
                }
            }
            else{
                x = 0;
            }
        }
        System.out.print(max);
    }
}
