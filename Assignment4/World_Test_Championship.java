// BCCI Announced Test squad last Month for the tour of England as the team will play the WTC final against New Zealand in June as well as five Test matches
// against England in August-September, India and New Zealand are the top two teams and now they have to play the World Test Championship (WTC) final test
// match and the winning team will lift the inaugural World Test Championship (WTC) trophy.
// Rohit Sharma also known as Hitman Sharma and vice captain of Indian Cricket Team decided that he will play very aggressively and will hit maximum time 
// sixes or fours. Also taking singles and doubles India won the match with ease because of Hitman Sharma's efforts.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(longest_substring(arr));
    }
     public static int longest_substring(int[] s){
        int ans = 0;
        int ei = 0;
        int si = 0;
        int[] arr = new int[100];
        while(ei<s.length){
            //grow
            arr[s[ei]]++;
            //shrink
            while(arr[s[ei]]>1){
                arr[s[si]]--;
                si++;
            }
            //ans calculate
            ans = Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
