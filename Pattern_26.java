import java.util.Scanner;

public class Pattern_26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        int x = 1;
        while (row <= n) {
            x = 1;
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while (j <= star) {
                System.out.print(x + " ");
                x++;
                j++;
            }

            space--;
            star += 2;
            System.out.println();
            row++;

        }

    }

}