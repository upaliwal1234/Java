import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        Rotate(arr);
    }
    public static void Rotate(int[][] arr){
        for(int i = arr[0].length-1; i>=0 ; i--){
            for(int j = 0 ; j<arr.length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
