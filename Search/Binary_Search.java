//Binary Search
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 5, 8, 11, 14, 17, 20, 40 };
        int t = sc.nextInt();   //target
        System.out.print(Search(arr, t));
    }

    public static int Search(int[] arr, int t) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (t < arr[mid]) {
                h = mid - 1;
            } else if (t > arr[mid]) {
                l = mid + 1;
            }
        }
        return -1;
    }

}
