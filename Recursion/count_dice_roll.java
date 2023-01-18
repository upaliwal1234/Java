public class count_dice_roll {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("\n" + count_Path(0, n, ""));
    }

    public static int count_Path(int src, int des, String ans) {
        if (src == des) {
            System.out.print(ans + " ");
            return 1;
        }
        if (src > des) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            count += count_Path(src + i, des, ans + i);
        }
        return count;
        // int a = count_Path(src + 1, des, ans + 1);
        // int b = count_Path(src + 2, des, ans + 2);
        // int c = count_Path(src + 3, des, ans + 3);

        // return a + b + c;
    }

}
