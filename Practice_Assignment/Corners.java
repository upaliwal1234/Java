// Corners is a game played in Eastern states of India.
// It’s usually played with 4 or more players, where each player occupies a spot, representing corners of a polygon. A player who’s chosen to be the Tat
// must go to a player at one of the corners, who will then redirect him/her to one of the other corners. While the Tat is on his/her way to the redirected 
// corner, others try to exchange their spot and Tat would try to take it as an opportunity to capture the corner, leaving one of the others as the new Tat, 
// similar to Musical Chairs.
// Mili was one day playing Corners with her friends, and a thought struck her mind. If all the players holding the corners make up their mind,
// and have decided where to redirect the Tat, then it may be possible that the Tat is stuck in a loop (or cycle) indefinitely.
// Find the loop having the maximum number of corners.
// Note: A player may redirect the Tat to himself/herself, representing a loop involving a single corner.
// Corners
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] rra = new int[t];
        for(int i = 0; i<rra.length; i++){
            rra[i] = scan.nextInt();
        }
        System.out.print(Corner_longest_loop(rra));
    }
    public static int Corner_longest_loop(int[] rra){
        int max_corner = 0;
        for(int i = 0; i<rra.length; i++){
            int count = 0;
            int si = -1;
            int ei = rra[i];
            while(count>=0 && ei!=si){
                ei = rra[ei];
                si = rra[i];
                count++;
            }
            max_corner = Math.max(count,max_corner);
        }
        return max_corner;
    }
}
