import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sp = 1;
        int x = n / 2;
        while (i <= n) {
            int j = 1;
            while (j <= x) {
                System.out.print("* ");
                j++;
            }
            int k = 1;
            while (k <= sp) {
                System.out.print("  ");
                k++;
            }
            int l = 1;
            while (l <= x) {
                System.out.print("* ");
                l++;
            }
            if (i <= n / 2) {
                x--;
                sp += 2;
            } else if (i > n / 2) {
                x++;
                sp -= 2;
            }
            i++;
            System.out.println();
        }
        sc.close();
    }
}
