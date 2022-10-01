import java.util.Scanner;

public class Pattern_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sp = n - 1;
        int val = n;
        int x = 1;
        while (i <= n) {
            int j = 1;
            while (j <= sp) {
                System.out.print("   ");
                j++;
            }
            int k = 1;
            int y = val;
            while (k <= x) {
                if (y == n) {
                    System.out.print(0 + "  ");
                } else {
                    System.out.print(y + "  ");
                }
                if (k <= x / 2) {
                    y++;
                } else {
                    y--;
                }
                k++;
            }
            x += 2;
            val--;
            sp--;
            System.out.println();
            i++;
        }
        sc.close();
    }
}
