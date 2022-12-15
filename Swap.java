public class swap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, -7 };
        System.out.println(arr[0] + " " + arr[1]);
        swapping(arr, 0, 1);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void swapping(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];

        a[j] = temp;
    }
}
