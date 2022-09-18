import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        int i=1;

        while(i<=n){
            int j=1;
            while(j<=sp){
                System.out.print(" ");
                j++;
            }
            if(i==1 || i==n){
                int k=1;
                while(k<=n){
                    System.out.print("*");
                    k++;
                }
            }
            else{
                System.out.print("*");

                int l=1;
                while(l<=(n-2)){
                    System.out.print(" ");
                    l++;
                }
                System.out.print("*");
                }
            sp--;
            System.out.println();
            i++;
        }

    }
}
