import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.print(search(arr,t));

    }
    public static int search(int[] arr, int t){
        int target = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==t){
                target = i;
            }
        }
        return target;
    }
}
