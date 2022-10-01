import java.util.Scanner;

public class Pattern_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = n - 1;
        int i = 1;
        int x = -1;
        while (i <= n) {
            int j = 1;
            while (j <= sp) {
                System.out.print("    ");
                j++;
            }
            System.out.print(i + "   ");
            int k = 1;
            while (k <= x) {
                System.out.print(0 + "   ");
                k++;
            }
            if (i >= 2) {
                System.out.print(i);
            }
            System.out.println();
            x += 2;
            sp--;
            i++;
        }
        sc.close();
    }
}
