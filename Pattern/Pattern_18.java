import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int x = 1;
        int sp = n / 2;
        while (i <= n) {
            int j = 1;
            while (j <= sp) {
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while (k <= x) {
                System.out.print("* ");
                k++;
            }
            if (i <= n / 2) {
                sp--;
                x += 2;
            } else {
                sp++;
                x -= 2;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
