import java.util.Scanner;

public class Rotate_2D_Array {
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
        Rotate_2D(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void Transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
    }

    public static void Rotate_2D(int[][] arr) {
        Transpose(arr);
        for (int i = 0; i < arr.length; i++) {
            Reverse(arr[i], 0, arr[0].length - 1);
        }
    }

    public static void Reverse(int[] arr, int i, int j) {
        int n = arr.length;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
            i++;
            j--;
        }
    }
}
