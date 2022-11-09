import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int t = sc.nextInt();
        System.out.print(Search(arr,t));
        sc.close();
    }
    public static int Search(int[][] arr, int t){
        for(int i = 0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                if(arr[i][j]==t){
                    return 1;
                }
            }
        }
        return 0;

    }

}
