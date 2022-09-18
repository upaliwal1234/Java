import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int x=n;
        int y=n;
        while(x>0){
            x=x/10;
            i++;
        }
        int a=0;
        int sum = 0;
        while(n>0){
            a=n%10;
            n=n/10;
            sum=sum+(int)(Math.pow(a,i));
        }
        if(sum==y){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
