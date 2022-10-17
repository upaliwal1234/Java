import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int sum=0;
            int n=sc.nextInt();
            int []A=new int[n];
            for(int j=0;j<n;j++)
            {
                A[j]=sc.nextInt();
            }
            int current_sum=0;
            int max_sum=Integer.MIN_VALUE;
            for(int k=0;k<n;k++){
                current_sum = 0;
                for(int l = k;l<A.length+k;l++){
                     int l0 = l % A.length;
                    current_sum += A[l0];
                    if(max_sum<current_sum){
                        max_sum = current_sum;
                    }
                    if(current_sum<0)
                    {
                        current_sum=0;
                    }
                }
            }
            System.out.println(max_sum);
        }
    }
}
