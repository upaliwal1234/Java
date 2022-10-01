import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int[] cost = new int[4];
            for(int i = 0; i<cost.length ; i++){
                cost[i] = sc.nextInt();
            }
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] n1 = new int[n];
            for(int i = 0; i<n;i++){
                n1[i] = sc.nextInt();
            }
            int[] m1 = new int[m];
            for(int i = 0; i<m; i++){
                m1[i] = sc.nextInt();
            }
            int tn = 0;
            for(int i = 0; i<n;i++){
                tn = tn+(Math.min(n1[i]*cost[0], cost[1]));
            }
            tn = Math.min(tn,cost[2]);
            int tm = 0;
            for(int i = 0; i<m ; i++){
                tm = tm + (Math.min(m1[i]*cost[0], cost[1]));
            }
            tm = Math.min(tm,cost[2]);
            System.out.println(Math.min(tn+tm,cost[3]));
            t--;
        }
    }
}
