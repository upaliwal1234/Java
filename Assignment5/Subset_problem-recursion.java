// Take an input N, a number. Take N more inputs and store that in an array. Take an input target, a number
// a. Write a recursive function which prints subsets of the array which sum to target.
// b. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan21 = new Scanner(System.in);
        int n=scan21.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scan21.nextInt();
        }
        int item = scan21.nextInt();
        target(arr,0,item,0,"");
        System.out.println();
        System.out.println(targetg(arr,0,item,0,""));
    }
    public static void target(int[]arr,int stargett,int item,int m,String xzy){
        if(stargett==arr.length){
            if(item==0){
                m++;
                System.out.print(xzy+" ");
            }
            return ;
        }
    target(arr,stargett+1,item-arr[stargett],m,xzy+arr[stargett]+" ");
    target(arr,stargett+1,item,m,xzy+"");
       
    }
    public static int targetg(int[]arr,int stargett,int item,int m,String xzy){
        if(stargett==arr.length){
            if(item==0){
                m++;
            }
            return m;
        }
       m=targetg(arr,stargett+1,item-arr[stargett],m,xzy+arr[stargett]+" ");
       m=targetg(arr,stargett+1,item,m,xzy+" ");
       return m;
    }
}
