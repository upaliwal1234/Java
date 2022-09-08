import java.util.Scanner;

public class Dec_to_Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 0;
        int sum = 0;
        int mul = 1;
        while (n > 0) {
            b = n % 2;
            n = n / 2;
            sum = sum + b * mul;
            mul = mul * 10;
        }
        System.out.print(sum);
        sc.close();
    }
}
