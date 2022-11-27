import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        String st = scan.next();
        System.out.print(longest_substring(st));
    }
    public static int longest_substring(String s){
        int ans = 0;
        int ei = 0;
        int si = 0;
        int[] arr = new int[123];
        while(ei<s.length()){
            //grow
            arr[s.charAt(ei)]++;
            //shrink
            while(arr[s.charAt(ei)]>1){
                arr[s.charAt(si)]--;
                si++;
            }
            //ans calculate
            ans = Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
