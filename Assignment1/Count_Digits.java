import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a = 0;
        int i = 0;
        while(n>0){
            a=n%10;
            n=n/10;
            if(a==x){
                i++;
            }
        }
        System.out.print(i);
    }
}
