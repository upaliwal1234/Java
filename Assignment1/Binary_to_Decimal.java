import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int s=0;
        int mul = 1;
        while(n>0){
            a=n%10;
            n=n/10;
            s=s+a*mul;
            mul=mul*2;
        }
        System.out.print(s);
    }
}
