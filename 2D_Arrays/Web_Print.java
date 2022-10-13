import java.util.Scanner;

public class basic {
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
        Web_Print(arr);
    }

    // public static void Display(int[][] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[0].length; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }
    // }

    public static void Web_Print(int[][] arr) {
        // int x = 0;
        for (int j = 0; j < arr[0].length; j++) {
            // for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[x][j] + " ");
            // if (j % 2 == 0 && i < arr.length - 1) {
            // x++;
            // } else if (j % 2 != 0 && i < arr.length - 1) {
            // x--;
            // }
            // }
            if (j % 2 == 0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
