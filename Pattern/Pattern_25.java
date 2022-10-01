import java.util.Scanner;

public class Pattern_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n - 1;
        int i = 1;
        int x = 1;
        while (i <= n) {
            int j = 1;
            while (j <= sp) {
                System.out.print("    ");
                j++;
            }
            int k = 1;
            while (k <= i * 2 - 1) {
                if (x < 9) {

                    System.out.print(x + "   ");
                } else
                    System.out.print(x + "  ");
                x++;
                k++;
            }
            System.out.println();
            sp--;
            i++;
        }
        sc.close();
    }
}
