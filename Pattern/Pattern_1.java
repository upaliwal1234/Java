import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
