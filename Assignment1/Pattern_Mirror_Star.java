import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sp = (n-1)/2;
        int k=1;
        while(i<=n){
            int x = 1;
            while(x <= sp){
                System.out.print("     ");
                x++;
            }
            int j=1;
            while(j<=k){
                System.out.print("*    ");
                j++;
            }
            if(i<(n+1)/2){
                sp--;
                k=k+2;
            }
            else{
                sp++;
                k=k-2;
            }
            i++;
            System.out.println();
        }
    }
}
