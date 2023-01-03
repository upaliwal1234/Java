// You are given an array A, of size N representing a sequence. The sequence is considered to be Good if no element is greater than its next. 
// However, if you are allowed to modify at most one element. Would you be able to make the sequence Good?
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] rra = new int[t];
        for(int p = 0; p<rra.length; p++){
            rra[p] = scan.nextInt();
        }
        System.out.print(Good_Sequence(rra));
    }
    public static boolean Good_Sequence(int[] rra){
        int pt = -1;
        for(int p = 0; p<rra.length-1; p++){
            if(rra[p]>rra[p+1]){
                if(pt!=-1){
                    return false;
                }
                pt = p;
            }
        }
        return pt==0 || pt==-1 || pt==rra.length-2 || rra[pt-1]<=rra[pt+1] || rra[pt]<=rra[pt+2];
    }
}
