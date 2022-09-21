// import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // sc.close()
        int[] arr = { 1, 3, 1, 3, 2, 4, 433, -99 };
        System.out.println(max(arr));
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return (max);
    }

}
