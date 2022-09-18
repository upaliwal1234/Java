import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sp = (n*2)-3;
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print(j+"    ");
                j++;
            }
            int k = 1;
            while(k<=sp){
                System.out.print("     ");
                k++;
            }
            int x = i;
            int l = 1;
            while(l<=i){
                if(x<n){
                System.out.print(x+"    ");
                }
                x--;
                l++;
            }
            sp-=2;
            i++;
            System.out.println();
        }
    }
}
