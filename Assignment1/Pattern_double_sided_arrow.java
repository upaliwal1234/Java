import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        int i=1;
        int x=1;
        int sp1=-1;
        while(i<=n){
            int j=1;
            while(j<=sp){
                System.out.print("  ");
                j++;
            }
            int k=x;
            while(k>0){
                System.out.print(k+" ");
                k--;
            }
            if(i>1 && i<n){
            int l=1;
            while(l<=sp1){
                System.out.print("  ");
                l++;
            }
            int m=1;
            while(m<=x){
                System.out.print(m+" ");
                m++;
                }
            }
            if(i<=n/2){
                sp=sp-2;
                x++;
                sp1=sp1+2;
            }
            else{
                sp=sp+2;
                x--;
                sp1=sp1-2;
            }
            System.out.println();
            i++;
        }
    }
}
