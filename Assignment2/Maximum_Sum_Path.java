//Maximum Sum Path in Two Arrays.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[]A=new int[n];
            int[]B=new int[m];
            for(int j=0;j<n;j++)
            {
                A[j]=sc.nextInt();
            }
            for(int k=0;k<m;k++)
            {
                B[k]=sc.nextInt();
            }
            int sum1=0;
            int sum2=0;
            int result=0;
            int a=0;
            int b=0;
            while(a<n && b<m)
            {
                if(A[a]<B[b])
                {
                    sum1=sum1+A[a];
                    a++;
                }
                else if(A[a]>B[b])
                {
                    sum2=sum2+B[b];
                    b++;
                }
                else
                {
                    result=result+Math.max(sum1,sum2)+A[a];
                    sum1=0;
                    sum2=0;
                    a++;
                    b++;
                }
            }
            while(a<n)
            {
                sum1+=A[a++];
            }
            while(b<m)
            {
                sum2+=B[b++];
            }
            result+=Math.max(sum1,sum2);
            System.out.println(result);
        }

    }
}
