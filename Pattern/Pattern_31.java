import java.util.Scanner;

public class Pattern_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int x = 1;
        while (i <= n) {
            int j = n;
            while (j > 0) {
                if (j == x) {
                    System.out.print("*  ");
                } else {
                    System.out.print(j + "  ");
                }
                j--;
            }
            x++;
            System.out.println();
            i++;
        }
        sc.close();
    }
}
