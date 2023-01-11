import java.util.Scanner;

public class last_occur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 3, 7, 2, 5, 7, 9, 7 };
        int item = sc.nextInt();
        System.out.println(last_occurence(arr, item, arr.length - 1));
    }

    public static int last_occurence(int[] arr, int item, int i) {
        if (i == -1 || arr[i] == item) {
            return i;
        }
        return last_occurence(arr, item, i - 1);
    }

}
