import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int x=-1;
        int y=1;
        int fib=0;
        while(i<=n){
            int j=1;
            while(j<=i){
                fib=x+y;
                System.out.print(fib+"    ");
                x=y;
                y=fib;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
