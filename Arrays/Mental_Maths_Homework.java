// Monu’s Maths Teacher at school gave him some numbers today and she promised him a treat if he could find the greatest product that he can make
// using any three of those numbers. He is very weak in his studies and is really bad with numbers, 
// help him find the answer if the numbers are given as an array A, of size N.

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] Z = new int[t];
        for(int k = 0;k<t;k++){
            Z[k] = scan.nextInt();
        }
       System.out.print(max_product123(Z));
       scan.close();
    }
    public static long max_product123(int[] rra){
        long ans = Integer.MIN_VALUE;
        long prod = 1;
        Arrays.sort(rra);
        long prod1 = rra[rra.length-1]*rra[rra.length-2]*rra[rra.length-3];
        
            prod = rra[0]*rra[1]*rra[rra.length-1];
        ans = Math.max(prod,prod1);
        return ans;
    }
}
