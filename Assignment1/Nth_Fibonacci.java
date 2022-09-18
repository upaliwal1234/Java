import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=-1;
        int y=1;
        int fib=0;
        while(n>=0){
            fib=x+y;
            x=y;
            y=fib;
            n--;
        }
        System.out.print(fib);
    }
}
