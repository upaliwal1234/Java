import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp1 = 0;
        int sp2 = n - 2;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= sp1) {
                System.out.print("  ");
                j++;
            }
            System.out.print("* ");
            int k = 1;
            while (k <= sp2) {
                System.out.print("  ");
                k++;
            }
            if (i <= n / 2) {
                System.out.print("* ");
                sp1++;
                sp2 -= 2;
            } else {
                sp1--;
                sp2 += 2;
            }
            if (i > (n / 2) + 1) {
                System.out.print("* ");
            }
            i++;
            System.out.println();
        }

        sc.close();
    }
}
