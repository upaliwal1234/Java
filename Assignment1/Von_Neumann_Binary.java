import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int x = sc.nextInt();
            int mul =1;
            int a=0;
            int s=0;
            while(x>0){
                a=x%10;
                x=x/10;
                s=s+a*mul;
                mul=mul*2;
            }
            System.out.println(s);
            n--;
        }
    }
}
