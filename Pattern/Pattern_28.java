import java.util.Scanner;

public class Pattern_28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int sp = n - 1;
        int x = 1;
        while (row <= n) {
            int i = 1;
            while (i <= sp) {
                System.out.print("   ");
                i++;
            }

            int j = 1;
            int val = row;
            while (j <= x) {
                System.out.print(val + "  ");
                if (j <= x / 2) {
                    val++;
                } else {
                    val--;
                }
                j++;
            }

            sp--;
            x += 2;
            System.out.println();
            row++;

        }

    }

}