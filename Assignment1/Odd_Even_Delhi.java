import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int n1 = sc.nextInt();
            int a=0;
            int s1=0;
            int s2=0;
            while(n1>0){
                a=n1%10;
                n1=n1/10;
                if(a%2==0){
                    s1 = s1 + a;
                }
                else if(a%2!=0){
                    s2 = s2 +a;
                }

            }
                if(s1%4==0 || s2%3==0){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            n--;
        }
    }
}
