import java.util.Scanner;

public class Pattern_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int x = 1;
        while (i < n * 2) {
            int j = 1;
            while (j <= 2 * x - 1) {
                if (j % 2 == 0) {
                    System.out.print("*  ");
                } else {
                    System.out.print(x + "  ");
                }
                j++;
            }
            System.out.println();
            if (i < n) {
                x++;
            } else {
                x--;
            }
            i++;
        }
        sc.close();
    }
}
