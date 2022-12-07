// BCCI Announced Test squad last Month for the tour of England as the team will play the WTC final against New Zealand in June 
// as well as five Test matches against England in August-September, India and New Zealand are the top two teams and now they have to play 
// the World Test Championship (WTC) final test match and the winning team will lift the inaugural World Test Championship (WTC) trophy.
// Rohit Sharma also known as Hitman Sharma and vice captain of Indian Cricket Team decided that he will play very aggressively and
// will hit maximum time sixes or fours. Also taking singles and doubles India won the match with ease because of Hitman Sharma's efforts.
// But due to some technical issues, the records of his boundaries and singles and doubles got lost . Now Cricinfo, which maintains the records
// for each player, wants to hire you as a developer if you are able to resolve this problem and give them the exact count of runs in every over.
// Cricinfo will give you an array of N overs, containing runs made in each over.
// For making your task easy, maximize the contiguous number of overs such that in every over different runs were made.
// If you are able to complete this task successfully, then congratulations you are hired.

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
