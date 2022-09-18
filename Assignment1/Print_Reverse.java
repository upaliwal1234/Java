import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int rev=0;
        while(n>0){
            a=n%10;
            n=n/10;
            rev=rev*10+a;
        }
        System.out.print(rev);
    }
}
