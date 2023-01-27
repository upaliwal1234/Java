import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan21 = new Scanner(System.in);
        int n = scan21.nextInt();
        int[]rra = new int[n];
        for(int i=0;i<rra.length;i++){
            rra[i]=scan21.nextInt();
        }
        System.out.println(split_Array(rra,0,0,"","",0,0));
    }
    public static int split_Array(int[]rra,int xy,int mn,String sna_1,String sna_2,int i,int xzy){
        if(xy == mn && xzy == rra.length){
            System.out.println(sna_1+" and "+sna_2);
            return 1;
        }
        if(i==rra.length){
            return 0;
        }
       int a = split_Array(rra,xy+rra[i],mn,sna_1+rra[i]+" ",sna_2,i+1,xzy+1);
       int b = split_Array(rra,xy,mn+rra[i],sna_1,sna_2+rra[i]+" ",i+1,xzy+1);
       return a+b;
    }
}
