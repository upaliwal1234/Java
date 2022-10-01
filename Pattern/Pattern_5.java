import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        int sp = 0;
        while (i > 0) {
            int k = 1;
            while (k <= sp) {
                System.out.print("  ");
                k++;
            }
            sp++;
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
