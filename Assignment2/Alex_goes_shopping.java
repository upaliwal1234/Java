import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i = 0; i<q; i++){
            int A = sc.nextInt();
            int k = sc.nextInt();
            int j = 0;
            for(int l = 0; l<n ; l++){
                if(A%a[l]==0){
                    j++;
                }
            }
            if(j>=k){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
