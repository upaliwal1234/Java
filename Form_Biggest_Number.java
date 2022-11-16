public class Form_Biggest_Number {
    public static void main(String[] args) {
        int[] arr = { 54, 546, 548, 60 };
        Biggest_Number(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void Biggest_Number(int[] arr) {
        for (int pass = 1; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length - pass; i++) {
                if (compare(arr[i], arr[i + 1]) > 0) {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
            }
        }
    }

    public static Long compare(int x, int y) {
        String xy = "" + x + y;
        String yx = "" + y + x;
        return Long.parseLong(yx) - Long.parseLong(xy);
    }
}
