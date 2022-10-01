import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 2 * (n - 1);
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= sp) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print("*   ");
                k++;
            }
            System.out.println();
            sp -= 2;
            i++;
        }
        sc.close();
    }
}
