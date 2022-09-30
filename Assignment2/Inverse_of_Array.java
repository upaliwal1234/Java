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
        int[] ans = inverse(arr);
        for(int i = 0 ; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] inverse(int[] arr){
        int[] ans = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            ans[arr[i]] = i;
        }
        return ans;
    }
}
