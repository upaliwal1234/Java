import java.util.Scanner;

public class Pattern_27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        int val = 1;
        while (row <= n) {
            val = 1;
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while (j <= star) {
                System.out.print(val + " ");
                if (j <= star / 2) {
                    val++;
                } else {
                    val--;
                }
                j++;
            }

            space--;
            star += 2;
            System.out.println();
            row++;

        }

    }

}