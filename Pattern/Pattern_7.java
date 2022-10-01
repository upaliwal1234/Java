import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n - 2;
        int i = 1;
        while (i <= n) {

            if (i == 1 || i == n) {
                int j = 1;
                while (j <= n) {
                    System.out.print("* ");
                    j++;
                }
            } else {
                System.out.print("* ");
                int k = 1;
                while (k <= sp) {
                    System.out.print("  ");
                    k++;
                }
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}