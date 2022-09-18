import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sp = n*2-1; 
        int t = 1;
        int y = n;
        while(i<=(n*2)+1){
            int j=1;
            int x = n;
            while(j<=t){
                System.out.print(x+" ");
                j++;
                x--;
            }
            int k=1;
            while(k<=sp){
                System.out.print("  ");
                k++;
            }
            int l = 1;
            int z = y;
            while(l<=t){
                if(z!=0){
                System.out.print(z+" ");
                }
                z++;
                l++;
            }
            if(i<=n){                
            sp-=2;
            t++;
            y--;
            }
            else{
                sp+=2;
                t--;
                y++;
            }
            System.out.println();
            i++;
        }
    }
}
