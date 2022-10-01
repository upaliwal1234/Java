import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            int[] ans = pair(arr, target);
            System.out.println("Deepak should buy roses whose prices are "+ans[0]+" and "+ans[1]+".");
            t--;
        }
    }

    public static int[] pair(int[] arr,int target){
        int[] ans = new int[2];
        int diff = Integer.MAX_VALUE;
        for(int i = 0;  i<arr.length-1;i++){
            for(int j = i+1; j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    int a = arr[i];
                    int b = arr[j];
                    if(a>b){
                        a = arr[j];
                        b = arr[i];
                    }
                    if((b-a)<diff){
                        diff = b-a;
                        ans[0] = a;
                        ans[1] = b;
                    }
                }
            }
        }
        return ans;
    }
}
