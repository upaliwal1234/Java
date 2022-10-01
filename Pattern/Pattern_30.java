import java.util.Scanner;

public class Pattern_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = n;
            while (j > 0) {
                System.out.print(j + "  ");
                j--;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
