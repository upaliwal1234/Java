import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = n;
        long i = 0;
        while(m>0){
            m=m/10;
            i++;
        }
        long a=0;
        long s=0;
        long mul = 1;
        while(i>0){
            a=n%10;
            n=n/10;
            if(i>1){
                if((9-a)<a){
                    a=9-a;
                }
            }
            else if(i==1 && a < 9){
                if((9-a)<a){
                    a=9-a;
                }
            }
            else{
                a=a;
            }

            s=s+mul*a;
            mul=mul*10;
            i--;
        }
        System.out.print(s);
    }
}
