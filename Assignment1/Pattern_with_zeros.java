import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                if(j==1 || j==i){
                    System.out.print(i+"    ");
                }
                else{
                    System.out.print("0    ");
                }
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
