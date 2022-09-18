import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();;
        int s=0;
        if(sb!=10){
            int x=0;
            int mul = 1;
            while(sn>0){
                x=sn%10;
                sn=sn/10;
                s = s + mul*x;
                mul = mul*sb;
            }
        }
        if(s==0){
            s=sn;
        }
        if(db==10){
            System.out.print(s);
        }
        else{
        int i=0;
        int sum=0;
        int mul = 1;
        while(s>0){
            i=s%db;
            s=s/db;
            sum = sum + mul*i;
            mul = mul*10;
        }
        System.out.print(sum);
        }
    }
}
