// Given an integer N, now you have to convert all zeros of N to 5.
import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        int num = 0;
        while(n > 0){
            int t = n%10;
            n = n / 10;
            if(t == 0){
                t+=5;
            }
            num = num * 10 + t;
        }
        n = 0;
        while(num > 0){
            int t = num%10;
            num = num / 10;
            n = n * 10 + t;
        }
        System.out.print(n);
    }
}
