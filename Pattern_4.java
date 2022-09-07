import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sp = n - 1;
        while (i <= n) {
            int k = 1;
            while (k <= sp) {
                System.out.print("  ");
                k++;
            }
            sp--;
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
