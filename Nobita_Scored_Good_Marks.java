// Nobita Scored Good Marks
// Nobita and candies.

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan  = new Scanner(System.in);
        int test = scan.nextInt();
        while(test>0){
            int x = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(candies(x,n));
            test--;
        }
    }
    public static int candies(int a , int b){
        int ans = 0;
        int c = a%b;
        int d = (b-(a%b));
        ans = Math.min(c,d);
        return ans;
    }
}
