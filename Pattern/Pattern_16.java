import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sp = n - 1;
        int x = n;
        while (i < n * 2) {
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
            System.out.println();
            if (i < n) {
                x--;
                sp -= 1;
            } else {
                x++;
                sp += 1;
            }
            i++;
        }
        sc.close();
    }
}
