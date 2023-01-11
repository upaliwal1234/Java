import java.util.Scanner;

public class print_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n) {
        System.out.println(n);
        if (n > 1) {
            print(n - 1);
        }
    }
}
