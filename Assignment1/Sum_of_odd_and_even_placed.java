import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int i=1;
        int se=0;
        int so=0;
        while(n>0){
            a=n%10;
            n=n/10;
            if(i%2!=0){
                so=so+a;
            }
            else if(i%2==0){
                se=se+a;
            }
            i++;
        }
        System.out.println(so);
        System.out.print(se);
    }
}
