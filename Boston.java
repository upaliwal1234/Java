import java.util.Scanner;

public class Boston {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = n;
        int i = 2;
        int sum = 0;
        while (i <= n) {
            while (n % i == 0) {
                sum = sum + sod(i);
                n = n / i;
            }
            i++;
        }
        if (sum == sod(p)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        sc.close();
    }

    public static int sod(int i) {

        int sum = 0;
        while (i > 0) {
            int j = i % 10;
            i = i / 10;
            sum = sum + j;
        }
        return (sum);
    }
}
