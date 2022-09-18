import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n-1;
        int p = 1;
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=sp){
                System.out.print("     ");
                j++;
            }
            int k = 1;
            int x = i-1;
            while(k<=p){
                if(k<=i){
                    x++;
                    System.out.print(x+"    ");
                }
                else{
                    x--;
                    System.out.print(x+"    ");
                }
                k++;
            }
            p+=2;
            sp--;
            System.out.println();
            i++;
        }
    }
}
