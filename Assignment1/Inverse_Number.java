import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int p = sc.nextInt();
        int m = p;
        while(m>0){
            m=m/10;
            n++;
        }
        int [] a = new int[n];
        int q=0;
        while(p>0){
            int x = p%10;
            p=p/10;
            a[q] = x;
            q++;
        }
        // for(int i = 0;i<n;i++){
        //     System.out.println(a[i]);
        // }
        int [] b = new int[n];
        for(int i = 0;i<n;i++){
            int temp = a[i];
            b[temp-1]=i+1;
        }
        for(int i = n-1;i>=0;i--){
            System.out.print(b[i]);
        }

    }
}
