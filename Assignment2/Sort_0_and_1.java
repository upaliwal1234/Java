import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr){
        int x = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==0){
                x++;
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(x>0){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
            x--;
        }
    }
}
