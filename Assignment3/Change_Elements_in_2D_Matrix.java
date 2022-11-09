import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] ans = change(arr);
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] change(int[][] arr){
        int[][] arr1 = arr;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j]==0){
                    zero(arr1,i,j);
                }
            }
        }
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                if(arr1[i][j]==2){
                    arr1[i][j]=0;
                }
            }
        }
        return arr1;
    }
    public static void zero(int[][] arr1, int x, int y){
        for(int j = 0; j<arr1[0].length; j++ ){
            arr1[x][j] = 2;
        }
        for(int i = 0; i<arr1.length;i++){
            arr1[i][y] = 2;
        }
    }
}
