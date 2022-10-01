import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sp = 0;
        int x = n;
        while (i < n) {
            int j = 1;
            while (j <= sp) {
                System.out.print("    ");
                j++;
            }
            int k = 1;
            while (k <= x) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            x--;
            sp++;
            i++;
        }
        sc.close();
    }
}
