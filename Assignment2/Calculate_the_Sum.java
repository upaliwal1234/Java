//Calculate the Sum.
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
      //  int sum=0;
        int[]A=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        int l=0;
        int []B=new int[n];
        while(n>0)
        {
        	B[l]=A[l];
        	n--;
        	l++;
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int x=sc.nextInt();
            x=x%A.length;
            for(int j=0;j<A.length;j++)
            {
                
                int temp = j-x;
                if(temp<0){
                    temp=A.length+j-x;//
                }
                B[j]=A[j]+A[temp];
          }
           for(int k=0;k<A.length;k++)
           {
        	   A[k]=B[k];
           }
           
        }
        int sum=0;
         for(int k=0;k<A.length;k++)
           {
        	  // A[k]=B[k];
               sum+=A[k];
           }
        System.out.print(sum%(int)(Math.pow(10,9)+7));

}
}
