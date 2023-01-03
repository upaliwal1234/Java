// It's Emily’s birthday today, so all her friends brought candy for her. It’s customary at her school that every classmate of hers gives her one unique candy. 
// Some of her classmates were absent on that day, so Emily’s best friend, being mischievous, snuck some extra candies in place of those friends into her Candy Bag.
// You are given the contents of Emily’s Candy Bag, could you find which candies are from her best friend?
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] rra = new int[t];
        for(int p = 0; p<rra.length; p++){
            rra[p] = scan.nextInt();
        }
        System.out.print(bestfriend_candy(rra));
    }
    public static int bestfriend_candy(int[] rra){
        if(rra.length == 1){
            return rra[0];
        }
        Arrays.sort(rra);
        for(int i = 1; i<rra.length; i++){
            if(rra[i]==rra[i-1]){
                return rra[i];
            }
        }
        return 0;
    }
}
