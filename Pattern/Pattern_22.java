import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        int sp = -1;
        while (i >= 0) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            int k = 1;
            while (k <= sp) {
                System.out.print("  ");
                k++;
            }
            int l = 1;
            while (l <= i) {
                if (l < n) {
                    System.out.print("* ");
                }
                l++;
            }
            sp += 2;
            System.out.println();
            i--;
        }
        sc.close();
    }
}
