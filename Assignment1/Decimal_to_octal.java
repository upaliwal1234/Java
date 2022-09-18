import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        int s=0;
        while(a>0){
            a=n%8;
            n=n/8;
            s=s*10+a;
        }
        int x=0, rev=0;
        while(s>0){
            x=s%10;
            s=s/10;
            rev = rev * 10 + x;
        }
        System.out.print(rev);
    }
}
