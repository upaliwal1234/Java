import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        int i = n;
        while (i >= 0) {
            int j = 1;
            while (j <= sp) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k <= i * 2 - 1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            sp++;
            i--;
        }
        sc.close();
    }
}
