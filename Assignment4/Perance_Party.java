// Monu Bhaiya is hosting a party. He invites N of his/her students to his house and pairs them up. Each of his students has some Perance, 
// representing his/her performance at Coding Blocks.
// The charm of his party is represented by the sum of minimum Perance from each pair in the party. You are given an array A, of N elements, 
// where Ai is the Perance of a student at his party.
// Help him get the maximum charm for his party and output it.
// Given: N is even.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan987 = new Scanner(System.in);
        int n123987 = scan987.nextInt();
        int[] rra987 = new int[n123987];
        for(int i = 0; i<rra987.length;i++){
            rra987[i] = scan987.nextInt();
        }
        System.out.print(pair_max987(rra987));
    }
    public static int pair_max987(int[] rra987){
        int ans987 = 0;
        Arrays.sort(rra987);
        for(int i = 0;i<rra987.length;i+=2){
            ans987 = ans987+Math.min(rra987[i],rra987[i+1]);
        }
        return ans987;
    }
}
