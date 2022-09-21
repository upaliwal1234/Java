public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 1, 3, 2, 4, 433, -99 };
        Reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void Reverse(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < (l / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }

    }

}