// The prices of a given stock on a day is given in the form of an array A, of size N. Where Ai is the price of the stock on ith day. 
// Monu has just started trading in stocks and so he relies on one of his friends for advice.
// His friend, for some reason, advises him to trade only on days where the price of the stock keeps rising every day. 
// Would you be able to find the maximum number of continuous days where Monu can trade as per his friend’s advice?
// Note: The price must rise daily for Monu to trade.

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        long t = scan.nextLong();
        long[] Z = new long[(int)t];
        for(long i = 0; i<Z.length; i++){
            Z[(int)i] = scan.nextLong();
        }
        System.out.print(trader(Z));
    }
    public static long trader(long[] rra){
        long ans = Integer.MIN_VALUE;
        long ei = 0;
        long si = 0;
        long c = Integer.MIN_VALUE;
        while(ei<rra.length){
            if(rra[(int)ei]>c){
                c=rra[(int)ei];
                ans = Math.max(ans,ei-si+1);
            }
            else{
                si = ei;
                c = rra[(int)ei];
            }
            ei++;
        }
        return ans;
    }
}
