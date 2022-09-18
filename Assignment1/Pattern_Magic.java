import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int st = n-1;
        int sp = 1;
        int i=1;
        while(i<=(n*2-1)){
            if(i==1 || i==(n*2-1)){
                int j=1;
                while(j<=(n*2-1)){
                    System.out.print("*");
                    j++;
                }
            }
            else{
                    int k=1;
                    while(k<=st){
                        System.out.print("*");
                        k++;
                    }
                    int l=1;
                    while(l<=sp){
                        System.out.print(" ");
                        l++;
                    }
                    int m=1;
                    while(m<=st){
                        System.out.print("*");
                        m++;
                    }
            if(i<n){
                sp+=2;
                st--;
            }
            else{
                sp-=2;
                st++;
            }
            }       

            i++;
            System.out.println();
        }
        sc.close();
    }
}
