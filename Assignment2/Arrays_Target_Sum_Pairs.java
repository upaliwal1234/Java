import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(Math.min(arr[i], arr[j])+" and "+Math.max(arr[i], arr[j]));
                }
            }
        }
    }
}
