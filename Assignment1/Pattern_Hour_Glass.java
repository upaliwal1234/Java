import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        int i=1;
        int x = n;
        while(i<=(n*2)+1){
            int j = 1;
            while(j<=sp){
                System.out.print("  ");;
                j++;
            }
            int k = 1;
            int y = x;
            while(k<=(x*2)+1){
                System.out.print(y+" ");
                if(k<=x){
                    y--;
                }
                else{
                    y++;
                }
                k++;
            }
            if(i<=n){
            x--;
            sp++;
            }
            else{
                x++;
                sp--;
            }
            System.out.println();
            i++;
        }
        sc.close();

    }
}
