import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Wave_Print(arr);
        sc.close();
    }
    public static void Wave_Print(int[][] arr) {
        int x = 0;
        for (int j = 0; j < arr[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + ", ");
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }
        System.out.print("END");
    }
}
