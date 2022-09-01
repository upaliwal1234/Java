import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        int sp1 = n - 1;

        while (st <= n) {
            int i = 1;
            while (i <= sp1) {
                System.out.print("  ");
                i++;
            }
            sp1--;
            int j = 1;
            while (j <= st) {
                System.out.print("*   ");
                j++;
            }
            System.out.println();
            st++;
        }

    }
}