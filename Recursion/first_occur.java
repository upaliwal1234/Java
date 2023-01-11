import java.util.Scanner;

public class first_occur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 3, 7, 2, 5, 7, 9, 7 };
        int item = sc.nextInt();
        System.out.println(first_occurence(arr, item, 0));
    }

    public static int first_occurence(int[] arr, int item, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == item) {
            return i;
        }
        return first_occurence(arr, item, i + 1);
    }

}
