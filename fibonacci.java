import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = -1;
        int j = 1;
        int k = 0;
        while (n >= 0) {
            k = i + j;
            i = j;
            j = k;
            n--;
        }
        System.out.print(k);
        sc.close();
    }
}
