import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
        int i = 1;
        int j = 1;
        while (i <= n) {
            int l = (n * 2) - 1;
            int k = 1;
            while (k <= sp) {
                System.out.print(" ");
                k++;
            }
            sp += 2;
            while (l >= j) {
                System.out.print("* ");
                l--;
            }
            j += 2;
            System.out.println();
            i++;
        }
    }
}