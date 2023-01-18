public class Matrix_path {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Path(arr, 0, 0, "");
    }

    public static void Path(int[][] arr, int m, int n, String ans) {
        if (m == arr.length - 1 && n == arr[0].length - 1) {
            System.out.print(ans + " ");
            return;
        }
        if (m > arr.length - 1 || n > arr[0].length - 1) {
            return;
        }
        Path(arr, m + 1, n, ans + "V");
        Path(arr, m, n + 1, ans + "H");
    }
}
