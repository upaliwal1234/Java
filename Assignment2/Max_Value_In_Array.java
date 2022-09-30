import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(max(arr));
    }
    public static int max(int[] arr){
        int m = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>m){
                m = arr[i];
            }
        }
        return m;
    }
}
