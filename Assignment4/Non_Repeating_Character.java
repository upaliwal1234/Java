import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0){
            String s = scan.next();
            char ans = non_repeating_char(s);
            if(ans=='1'){
                System.out.println(-1);
            }
            else{
                System.out.println(ans);
            }
            t--;
        }
    }
    public static char non_repeating_char(String s){
        int[] arr = new int[123];
        for(int i = 0; i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int i = 0;i<s.length();i++){
            if(arr[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }
        return '1';
    }
}
