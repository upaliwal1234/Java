import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int i=1,j=2;
            int s1=0;
            int s2=0;
            int flag=1;
            while(flag!=0){
                if(s1+i<=M){
                s1=s1+i;
                }
                else{
                    flag=0;
                    break;
                }
                if(s2+j<=N){
                s2=s2+j;
                }
                else{
                    flag=0;
                    break;
                }
                j+=2;
                i+=2;
            }
            if(s1>s2){
                System.out.println("Aayush");
            }
            else{
                System.out.println("Harshit");
            }
            n--;
        }
    }
}
