import java.util.Scanner;

public class Pattern_cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp1 = 0;
        int sp2 = n - 2;
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < sp1) {
                System.out.print(" ");
                j++;
            }
            sp1++;
            System.out.print("* ");
            int k = 1;
            while (k <= sp2) {
                System.out.print("  ");
                k++;
            }
            if (sp2 >= 0) {
                System.out.print("* ");
            }
            sp2--;
            System.out.println();
            i++;
        }

    }
}
