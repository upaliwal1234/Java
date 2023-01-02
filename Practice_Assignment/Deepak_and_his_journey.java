// Deepak loves to travel but he wants to minimize the total travel expenditure. His journey will be through N checkpoints. 
// Checkpoints are numbered from 0 to N−1. At the start of his journey he is present at the checkpoint 0. 
// Also checkpoint N−1 will lead to his final destination.
// Each checkpoint has a petrol pump which can be used to fill petrol in the car. Now cost of petrol per litre at different checkpoints is given by array C 
// which has 0-based indexing where C[i] is the cost per litre of petrol at the ith checkpoint. Note that there is an infinite amount of supply at 
// each checkpoint and car tank is also of infinite capacity. 
// Now another array L is given which has 0-based indexing where L[i] denotes the amount of petrol in litres required to reach the (i+1)th checkpoint from the ith checkpoint. 
// Note that the extra petrol remaining in the tank does not vanishes after reaching a checkpoint. 
// Also, Deepak should have atleast L[i] litres of petrol at each checkpoint in order to reach the next checkpoint.
// Help Deepak to estimate the minimum cost required in order complete the journey.
// Deepak and his Journey
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long t = scan.nextLong();
        while(t>0){
            int n = scan.nextInt();
            long[] cost = new long[n];
            long[] petrol = new long[n];
            for(int i = 0; i<n; i++){
                cost[i] = scan.nextLong();
            }
            for(int i = 0; i<n; i++){
                petrol[i] = scan.nextLong();
            }
            long minc = cost[0];
            long ttl = minc*petrol[0];
            for(int i = 1; i<n; i++){
                if(minc > cost[i]){
                    minc = cost[i];
                    ttl = ttl + minc * petrol[i];
                }
                else{
                    ttl = ttl + minc * petrol[i];
                }
            }
            System.out.println(ttl);
            t--;
        }
    }
}
