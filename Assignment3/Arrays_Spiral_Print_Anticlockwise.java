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
        Spiral_Print(arr);
    }

    public static void Spiral_Print(int[][] arr) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int x = 0;
        int t = arr.length * arr[0].length;
        while (x < t) {
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][minc] + ", ");
                x++;
            }
            minc++;
            for (int i = minc; i <= maxc && x < t; i++) {
                System.out.print(arr[maxr][i] + ", ");
                x++;
            }
            maxr--;
            for (int i = maxr; i >= minr && x < t; i--) {
                System.out.print(arr[i][maxc] + ", ");
                x++;
            }
            maxc--;
            for (int i = maxc; i >= minc && x < t; i--) {
                System.out.print(arr[minr][i] + ", ");
                x++;
            }
            minr++;
        }
        System.out.print("END");
    }
}
