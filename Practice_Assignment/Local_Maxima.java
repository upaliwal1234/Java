// You may have studied about Local Maxima when working with Functions and its graph on the Cartesian Plane. 
// A Local Maxima is defined here as a point on the graph whose value is strictly greater than its neighbors.
// You are given an array A, of size N. Find the position of Local Maxima among the given values.
// NOTE: The first and last element need only be compared to the element next and prior to them respectively.
// Try to find the local maxima in O(log N) time.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] rra = new int[t];
        for(int i = 0; i<rra.length; i++){
            rra[i] = scan.nextInt();
        }
        System.out.print(local_maxima(rra));
    }
    public static int local_maxima(int[] rra){
        if(rra.length == 1){
            return 0;
        }
        else if(rra.length == 2){
            if(rra[0]>rra[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
        for(int i = 0; i<rra.length ; i++ ){
            if(i==0 && rra[i]>rra[i+1]){
                return i;
            }
            else if(i==rra.length-1 && rra[i]>rra[i-1]){
                return i;
            }
            else if(i>0 && i < rra.length-1 && rra[i]>rra[i-1] && rra[i]>rra[i+1]){
                return i;
            }
        }
        return 0;
    }
}
