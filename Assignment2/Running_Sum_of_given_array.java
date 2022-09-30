import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int [] ans = running_sum(arr);
        for(int i = 0; i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] running_sum(int[] arr){
        int sum = 0;
        int[] ans = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            sum += arr[i];
            ans[i] = sum;
        }
        return ans;
    }
}
